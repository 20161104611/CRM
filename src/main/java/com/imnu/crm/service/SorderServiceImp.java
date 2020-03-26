package com.imnu.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imnu.crm.mapper.SorderMapper;
import com.imnu.crm.pojo.Sorder;
import com.imnu.crm.pojo.SorderExample;

@Service
@Transactional
public class SorderServiceImp implements SorderService {
	@Autowired
	public SorderMapper sOrderMapper;

	@Override
	public void addSOrder(Sorder sOrder) {
		sOrderMapper.insertSelective(sOrder);
	}

	@Override
	public List<Sorder> findSOrderByPage(int page, int eid) {
		SorderExample example = new SorderExample();
		example.createCriteria().andEidEqualTo(eid);
		return sOrderMapper.selectByExample(example);
	}

	@Override
	public void DelectSOrderById(int id) {
		sOrderMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateSOrder(int id, Sorder sOrder) {
		SorderExample example = new SorderExample();
		example.createCriteria().andIdEqualTo(id);
		sOrderMapper.updateByExampleSelective(sOrder, example);
	}

	@Override
	public double sumSorderByEid(int eid) {
		return sOrderMapper.sumSorderByEid(eid);
	}

}
