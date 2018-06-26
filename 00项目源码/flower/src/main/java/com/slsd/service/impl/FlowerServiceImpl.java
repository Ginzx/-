package com.slsd.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.slsd.dao.FlowerDao;
import com.slsd.entity.Flower;
import com.slsd.service.FlowerService;

/**
* @ClassName: FlowerServiceImpl
* @Description:TODO(这里用一句话描述这个类的作用)
* @author: 王启明
* @date: 2018年6月24日 下午4:58:47
*
*/
@Service("FlowerService")
public class FlowerServiceImpl implements FlowerService {

	@Autowired
	@Qualifier("flowerDao")
	private FlowerDao Flowerdao;

	public List<Flower> findAll() {
		return Flowerdao.findAll();
	}

	public Flower findbyid(int id) {
		return Flowerdao.findbyid(id);
	}

	public boolean addFlower(Flower flower) {
		return (Flowerdao.addFlower(flower) > 0) ? true : false;
	}

	public boolean editFlower(Flower flower) {
		return (Flowerdao.editFlower(flower) > 0) ? true : false;
	}

	public boolean delFlower(int id) {
		return (Flowerdao.delFlower(id) > 0) ? true : false;
	}

}
