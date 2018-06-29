package com.slsd.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.slsd.entity.Comment;
import com.slsd.entity.Flower;
import com.slsd.entity.Order;
import com.slsd.entity.Orderlist;
import com.slsd.entity.OrderlistFlower;
import com.slsd.entity.User;
import com.slsd.service.CommentService;
import com.slsd.service.FlowerService;
import com.slsd.service.OrderService;
import com.slsd.service.OrderlistService;

@Controller
public class FlowerController {

	@Resource
	private FlowerService flowerService;

	@Resource
	private OrderService oService;

	@Resource
	private OrderlistService orlService;

	@Resource
	private CommentService comService;

	// 存储购物车记录
	List<OrderlistFlower> olist = new ArrayList<OrderlistFlower>();

	/**
	 * 
	 * @Title: cart
	 * @Description: TODO(跳到购物车)  @param: @param request  @param: @param model
	 *                @param: @return  @return: String  @throws
	 */
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String cart(HttpServletRequest request, Model model) {

		return "shoppingC";
	}

	/**
	 * 
	 * @Title: forpay
	 * @Description: TODO(调到forpay页面)  @param: @param request  @param: @param model
	 *                @param: @return  @return: String  @throws
	 */
	@RequestMapping(value = "/forpay", method = RequestMethod.GET)
	public String forpay(HttpServletRequest request, Model model) {

		return "forpay";
	}

	/**
	 * 
	 * @Title: intro
	 * @Description: TODO(调到店铺信息页面)  @param: @param request  @param: @param model
	 *                @param: @return  @return: String  @throws
	 */
	@RequestMapping(value = "/intro", method = RequestMethod.GET)
	public String intro(HttpServletRequest request, Model model) {
		return "introduce";
	}

	/**
	 * 
	 * @Title: all
	 * @Description: TODO(所有商品)  @param: @param request  @param: @param model
	 *                @param: @return  @return: String  @throws
	 */
	@RequestMapping(value = "/allshop", method = RequestMethod.GET)
	public String all(HttpServletRequest request, Model model) {
		// 便利数据库中所有的商品信息
		List<Flower> flist = flowerService.findAll();
		model.addAttribute("allFlower", flist);
		return "allshop";
	}

	/**
	 * 
	 * @Title: one
	 * @Description: TODO(到某一商品信息页面)  @param: @param id  @param: @param model
	 *                @param: @return  @return: String  @throws
	 */
	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public String one(@RequestParam("id") String id, Model model) {

		int ID = Integer.parseInt(id);
		Flower f = flowerService.findbyid(ID);

		model.addAttribute("flower", f);
		List<Flower> flist1 = flowerService.findAll();

		model.addAttribute("allFlower1", flist1);
		List<Comment> clist = comService.findbyflower(f.getCommentID());

		model.addAttribute("clist", clist);
		return "shop";
	}

	/**
	 * 
	 * @Title: addComment
	 * @Description: TODO(发表评论)  @param: @param cid  @param: @param request
	 *                @param: @param model  @param: @return  @return: String
	 *                @throws
	 */
	@RequestMapping(value = "/addComment", method = RequestMethod.POST)
	public String addComment(@RequestParam("cid") String cid, HttpServletRequest request, Model model) {
		int cID = Integer.parseInt(cid);
		// 从session中调用user
		User users = (User) request.getSession().getAttribute("user");
		Comment ct = new Comment();
		String content = request.getParameter("content");
		ct.setComment(content);
		ct.setCommentID(cID);

		ct.setUser(users.getUsername());
		comService.add(ct);
		model.addAttribute("ct", "<script>alert('评论发表成功')</script>");

		Flower f = flowerService.findbyid(cID);
		f.setCommentID(cID);
		// 修改商品所对应的评论好
		flowerService.editFlower(f);
		model.addAttribute("flower", f);
		// 遍历数据库中的商品信息
		List<Flower> flist1 = flowerService.findAll();
		model.addAttribute("allFlower1", flist1);
		// 遍历相应商品的评论信息
		List<Comment> clist = comService.findbyflower(f.getCommentID());
		model.addAttribute("clist", clist);
		return "shop";
	}

	/**
	 * 
	 * @Title: addCart
	 * @Description: TODO(添加购买记录到购物车)  @param: @param request  @param: @param model
	 *                @param: @return  @param: @throws IOException  @return: String
	 *                @throws
	 */
	@RequestMapping(value = "/addCart", method = RequestMethod.POST)
	public String addCart(HttpServletRequest request, Model model) throws IOException {

		int flag = 0;
		// 获取前台相应的值
		String name = request.getParameter("flower");
		String type = request.getParameter("type");
		String src = request.getParameter("picture");
		int num = Integer.parseInt(request.getParameter("number"));
		int id = Integer.parseInt(request.getParameter("ID"));
		// 获取商品单价
		Double pic = Double.parseDouble(request.getParameter("price"));
		// 计算总价格
		Double money = pic * num;
      
		OrderlistFlower olf = new OrderlistFlower();
		olf.setFlower(name);
		olf.setNumber(num);
		olf.setPrice(money);
		olf.setPrice2(pic);
		olf.setID(id);
		olf.setPicture(src);
		olf.setType(type);

		for (OrderlistFlower oF : olist) {
			if (name.equals(oF.getFlower())) {// 如果用户添加购物车内已经有的商品
				flag = 1;
				model.addAttribute("err2", "<script>alert('购物车中已有此商品')</script>");
			}
		}

		if (flag == 0) {
			olist.add(olf);
		}

		HttpSession session = request.getSession(true);
		session.setAttribute("ollist", olist);

		int osize = olist.size();
		session.setAttribute("len", osize);

		List<Flower> flist = flowerService.findAll();
		model.addAttribute("allFlower", flist);
		// 遍历所有商品信息
		Flower f = flowerService.findbyid(id);
		model.addAttribute("flower", f);
		List<Flower> flist1 = flowerService.findAll();
		model.addAttribute("allFlower1", flist1);
		List<Comment> clist = comService.findbyflower(f.getCommentID());
		model.addAttribute("clist", clist);
		return "shop";
	}

	/**
	 * 
	 * @Title: del
	 * @Description: TODO(购物车中删除某一购物信息)  @param: @param id  @param: @param model
	 *                @param: @return  @return: String  @throws
	 */
	@RequestMapping(value = "/del", method = RequestMethod.GET)
	public String del(@RequestParam("id") String id, Model model) {
		int ID = Integer.parseInt(id);
		for (int i = 0; i < olist.size(); i++) {
			if (olist.get(i).getID() == ID) {
				olist.remove(i);
			}
		}
		return "shoppingC";
	}

	/**
	 * 
	 * @Title: del2
	 * @Description: TODO(同上，跳回到商品页面，右侧购物车使用)  @param: @param id  @param: @param
	 *               model  @param: @return  @return: String  @throws
	 */
	@RequestMapping(value = "/del2", method = RequestMethod.GET)
	public String del2(@RequestParam("id") String id, Model model) {
		int ID = Integer.parseInt(id);
		for (int i = 0; i < olist.size(); i++) {
			if (olist.get(i).getID() == ID) {
				olist.remove(i);
			}
		}
        //右侧购物车内删除商品信息后遍历数据库内的信息
		Flower f = flowerService.findbyid(ID);
		model.addAttribute("flower", f);
		List<Flower> flist1 = flowerService.findAll();
		model.addAttribute("allFlower1", flist1);
		List<Comment> clist = comService.findbyflower(f.getCommentID());
		model.addAttribute("clist", clist);
		return "shop";
	}

	/**
	 * 
	 * @Title: addOrder
	 * @Description: TODO(购物车结算，正式下单)  @param: @param request  @param: @param model
	 *                @param: @return  @return: String  @throws
	 */
	@RequestMapping(value = "/addOrder", method = RequestMethod.POST)
	public String addOrder(HttpServletRequest request, Model model) {
		String[] a = request.getParameterValues("checkall");//获取购物车中已选中的商品ID

		List<Order> orlist = oService.findAll();

		int lidinc = orlist.get(orlist.size() - 1).getListID() + 1;//获得商品信息中最大的清单编号并+1

		User users = (User) request.getSession().getAttribute("user");//获得当前登陆用户信息

		Double sum = 0.0;

		//创建订单
		Date d = new Date();
		Order o = new Order();
		o.setListID(lidinc++);
		o.setTime(d);
		o.setUsername(users.getUsername());

		//结算购物车，清空购物车中已支付的商品信息
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < a.length; j++) {
				int s1 = Integer.parseInt(a[j]);

				if (i == s1) {
					int num = Integer.parseInt(request.getParameter("number_'" + s1 + "'"));
					Flower f = flowerService.findbyid(i);
					Orderlist ol = new Orderlist();
					ol.setFlower(f.getName());
					ol.setListID(o.getListID());
					ol.setNumber(num);
					ol.setPrice(num * f.getPrice());
					orlService.addOrderlist(ol);
					sum += ol.getPrice();
					for (int n = 0; n < olist.size(); n++) {
						if (olist.get(n).getID() == i) {
							olist.remove(n);
						}
					}
				}
			}
		}

		o.setPrice(sum);
		oService.addOrder(o);
		model.addAttribute("suc2", "<script>alert('购买成功！<br>您可以到个人界面中查看订单信息')</script>");

		return "index";
	}
}
