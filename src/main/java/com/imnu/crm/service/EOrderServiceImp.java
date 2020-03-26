package com.imnu.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imnu.crm.mapper.EorderMapper;
import com.imnu.crm.pojo.Eorder;
import com.imnu.crm.pojo.EorderExample;
@Service
@Transactional
public class EOrderServiceImp implements EOrderService {
	@Autowired
	public EorderMapper orderMapper;

	@Override
	public void addOrder(Eorder eOrder) {
		orderMapper.insertSelective(eOrder);
	}

	@Override
	public List<Eorder> findOrderByPage(int page) {
		EorderExample example = new EorderExample();
		return orderMapper.selectByExample(example);
	}

	@Override
	public void DelectOrderById(int id) {
		orderMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateOrder(int id, Eorder eOrder) {
		EorderExample example = new EorderExample();
		example.createCriteria().andIdEqualTo(id);
		orderMapper.updateByExampleSelective(eOrder, example);
	}

	@Override
	public List<Eorder> findOrderByNo(String no) {
		EorderExample example = new EorderExample();
		example.createCriteria().andNoEqualTo(no);
		return orderMapper.selectByExample(example);
	}

	@Override
	public void updateEorderByMoney(int id, double sum) {
		EorderExample example = new EorderExample();
		example.createCriteria().andIdEqualTo(id);
		Eorder eOrder = new Eorder();
		eOrder.setMoney(sum);
		orderMapper.updateByExampleSelective(eOrder, example);
	}
}
