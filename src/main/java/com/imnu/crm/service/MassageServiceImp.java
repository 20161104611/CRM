package com.imnu.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imnu.crm.mapper.MassageMapper;
import com.imnu.crm.pojo.EorderExample;
import com.imnu.crm.pojo.Massage;
import com.imnu.crm.pojo.MassageExample;
@Service
@Transactional
public class MassageServiceImp implements MassageService {

	@Autowired
	public MassageMapper massageMapper;
	
	@Override
	public void addMassage(Massage massage) {
		massageMapper.insertSelective(massage);
	}

	@Override
	public List<Massage> findMassageByPage(int page, int mid) {
		MassageExample example = new MassageExample();
		example.createCriteria().andMidEqualTo(mid);
		return massageMapper.selectByExample(example);
	}

	@Override
	public void DelectMassageById(int id) {
		massageMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Massage> findMassageAllByPage(int page) {
		MassageExample example = new MassageExample();
		return massageMapper.selectByExample(example);
	}

	

}
