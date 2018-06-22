package com.slsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.slsd.dao.FlowerDao;
import com.slsd.entity.Flower;
import com.slsd.service.FlowerService;

@Service("FlowerService")
public class FlowerServiceImpl implements FlowerService {

	@Autowired
	@Qualifier("flowerDaoimpl")
	private FlowerDao flowerdao;

	public List<Flower> findAll() {
		return flowerdao.findAll();
	}

	public Flower findbyid(int id) {
		return flowerdao.findbyid(id);
	}

	public boolean addFlower(Flower flower) {
		return (flowerdao.addFlower(flower) > 0) ? true : false;
	}

	public boolean editFlower(Flower flower) {
		return (flowerdao.editFlower(flower) > 0) ? true : false;
	}

	public boolean delFlower(int id) {
		return (flowerdao.delFlower(id) > 0) ? true : false;
	}

}
