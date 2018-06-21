package com.slsd.dao;

import java.util.List;

import com.slsd.entity.Flower;

/**
* @ClassName: FlowerDao
* @Description:TODO(商品类接口)
* @author: 王启明
* @date: 2018年6月21日 下午3:07:25
*
*/
public interface FlowerDao {

	/**
	* @Title: findAll
	* @Description: TODO(查找所有商品)
	* @param: @return
	* @return: List<Flower>
	* @throws
	*/
	public List<Flower> findAll();
	
	/**
	* @Title: findbyid
	* @Description: TODO(根据ID查找商品)
	* @param: @return
	* @return: Flower
	* @throws
	*/
	public Flower findbyid(int id);
	
	/**
	* @Title: addFlower
	* @Description: TODO(添加商品)
	* @param: @param flower
	* @param: @return
	* @return: int
	* @throws
	*/
	public int addFlower(Flower flower);
	
	/**
	* @Title: editFlower
	* @Description: TODO(修改商品信息)
	* @param: @param flower
	* @param: @return
	* @return: int
	* @throws
	*/
	public int editFlower(Flower flower);
	
	/**
	* @Title: delFlower
	* @Description: TODO(删除商品)
	* @param: @param id
	* @param: @return
	* @return: int
	* @throws
	*/
	public int delFlower(int id);
}
