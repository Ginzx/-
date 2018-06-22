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

<<<<<<< HEAD
	@Resource
	private FlowerDao Flowerdao;
=======
	@Autowired
	@Qualifier("flowerDaoimpl")
	private FlowerDao flowerdao;
>>>>>>> e8ef8bcd06c20bcc1ae3d7f2b331ac6aaaac5898

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
