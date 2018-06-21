package com.slsd.service;

import java.util.List;

import com.slsd.entity.Flower;

/**
* @ClassName: FlowerService
* @Description:TODO(商品)
* @author: 王启明
* @date: 2018年6月21日 下午4:51:31
*
*/
public interface FlowerService {

	public List<Flower> findAll();
	
	public Flower findbyid(int id);
	
	public boolean addFlower(Flower flower);
	
	public boolean editFlower(Flower flower);
	
	public boolean delFlower(int id);
}
