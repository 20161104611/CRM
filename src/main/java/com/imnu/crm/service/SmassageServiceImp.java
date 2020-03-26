package com.imnu.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imnu.crm.mapper.SmassageMapper;
import com.imnu.crm.pojo.Smassage;
import com.imnu.crm.pojo.SmassageExample;

@Service
@Transactional
public class SmassageServiceImp implements SmassageService {
	
	@Autowired
	public SmassageMapper sMassageMapper;

	@Override
	public List<Smassage> findMassageAllByPage(int page) {
		SmassageExample example = new SmassageExample();
		return sMassageMapper.selectByExample(example);
	}

	@Override
	public void addSMassage(Smassage sMassage) {
		sMassageMapper.insertSelective(sMassage);
	}
}
