package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	//�����û�id��ȡ��Ʒ��Ϣ
	List<Item> getItems(String orderId);
	//ɾ����������Ʒ��Ϣ
	void decreaseNumbers(List<Item> list);
}
