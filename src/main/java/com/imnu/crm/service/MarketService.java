package com.imnu.crm.service;

import java.util.List;

import com.imnu.crm.pojo.Market;

public interface MarketService {

	List<Market> findContractByPage(int page);

	void addERecord(Market market);

	void DelectMarketById(int id);


	void updateMarket(int id, Market market);

	int selMarketByName(String name);

	void updateMarketShour(int id, double sum);


}
