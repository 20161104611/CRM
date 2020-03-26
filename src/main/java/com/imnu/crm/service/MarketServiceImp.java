package com.imnu.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imnu.crm.mapper.MarketMapper;
import com.imnu.crm.pojo.Market;
import com.imnu.crm.pojo.MarketExample;

@Service
@Transactional
public class MarketServiceImp implements MarketService {
	@Autowired
	public MarketMapper marketMapper;

	@Override
	public List<Market> findContractByPage(int page) {
		MarketExample example = new MarketExample();
		return marketMapper.selectByExample(example);
	}

	@Override
	public void addERecord(Market market) {
		
		marketMapper.insertSelective(market);
	}

	@Override
	public void DelectMarketById(int id) {
		
		marketMapper.deleteByPrimaryKey(id);
	}

	

	@Override
	public void updateMarket(int id, Market market) {
		MarketExample example = new MarketExample();
		example.createCriteria().andIdEqualTo(id);
		marketMapper.updateByExampleSelective(market, example);
	}

	@Override
	public int selMarketByName(String name) {
		MarketExample example = new MarketExample();
		example.createCriteria().andNameEqualTo(name);
		List<Market> list =marketMapper.selectByExample(example);
		if(list.isEmpty())
		{
			return 0;
		}
		else
		{
			return list.get(0).getId();
		}
	}

	@Override
	public void updateMarketShour(int id,double sum) {
		MarketExample example = new MarketExample();
		example.createCriteria().andIdEqualTo(id);
		Market market = new Market();
		market.setShjshour(sum);
		marketMapper.updateByExampleSelective(market, example);
	}

	
}
