package com.imnu.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imnu.crm.mapper.ERecordMapper;
import com.imnu.crm.pojo.ERecord;
import com.imnu.crm.pojo.ERecordExample;

@Service
@Transactional
public class ERecordServiceImp implements ERecordService {
	@Autowired
	public ERecordMapper eRecordMapper;
	@Override
	public void addERecord(ERecord eRecord) {
		
		eRecordMapper.insertSelective(eRecord);
	}
	@Override
	public List<ERecord> findUserByPage(int page,int id) {
		ERecordExample example = new ERecordExample();
		example.createCriteria().andEIdEqualTo(id);
		return eRecordMapper.selectByExample(example);
	}

}
