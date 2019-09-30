package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	//根据用户id获取商品信息
	List<Item> getItems(String orderId);
	//删除库存里的商品信息
	void decreaseNumbers(List<Item> list);
}
