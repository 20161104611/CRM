package com.imnu.crm.service;

import java.util.List;

import com.imnu.crm.pojo.Eorder;
import com.imnu.crm.pojo.Sorder;

public interface EOrderService {

	void addOrder(Eorder order);

	List<Eorder> findOrderByPage(int page);

	void DelectOrderById(int id);

	void updateOrder(int id, Eorder order);

	List<Eorder> findOrderByNo(String no);

	void updateEorderByMoney(int id, double sum);

}
