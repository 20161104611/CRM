package com.imnu.crm.service;

import java.util.List;

import com.imnu.crm.pojo.Setmarket;

public interface SetMarketService {

	void addSetMarket(Setmarket setMarket);

	List<Setmarket> findSetMarketByPage(int page, int id);

	void updateSetMarket(int id, Setmarket setMarket);

	double sumSetMarket(int mid);

	void DelectSetMarketById(int id);

	

}
