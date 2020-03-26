package com.imnu.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imnu.crm.mapper.SetmarketMapper;
import com.imnu.crm.pojo.Market;
import com.imnu.crm.pojo.Setmarket;
import com.imnu.crm.pojo.SetmarketExample;

@Service
@Transactional
public class SetMarketServiceImp implements SetMarketService {
	@Autowired
	public SetmarketMapper setMarketMapper;

	@Override
	public void addSetMarket(Setmarket setMarket) {
		
		setMarketMapper.insertSelective(setMarket);
	}

	@Override
	public List<Setmarket> findSetMarketByPage(int page,int id) {
		SetmarketExample example = new SetmarketExample();
		example.createCriteria().andMidEqualTo(id);
		return setMarketMapper.selectByExample(example);
	}

	@Override
	public void updateSetMarket(int id, Setmarket setMarket) {
		SetmarketExample example = new SetmarketExample();
		example.createCriteria().andMidEqualTo(id);
		setMarketMapper.updateByExampleSelective(setMarket, example);
	}

	@Override
	public double sumSetMarket(int mid) {
		SetmarketExample example = new SetmarketExample();
		example.createCriteria().andMidEqualTo(mid);
		double sum = 0 ;
		sum = setMarketMapper.sumSetMarketByMid(mid);
		return sum;
	}

	@Override
	public void DelectSetMarketById(int id) {
		
		setMarketMapper.deleteByPrimaryKey(id);
	}

	
}
