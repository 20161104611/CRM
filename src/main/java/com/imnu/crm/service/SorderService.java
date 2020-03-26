package com.imnu.crm.service;

import java.util.List;

import com.imnu.crm.pojo.Sorder;

public interface SorderService {

	void addSOrder(Sorder sOrder);

	List<Sorder> findSOrderByPage(int page, int esid);

	void DelectSOrderById(int id);

	void updateSOrder(int id, Sorder sOrder);

	double sumSorderByEid(int eid);


}
