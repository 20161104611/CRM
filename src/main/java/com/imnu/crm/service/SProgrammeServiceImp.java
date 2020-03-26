package com.imnu.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imnu.crm.mapper.SprogrammeMapper;
import com.imnu.crm.pojo.Sprogramme;
import com.imnu.crm.pojo.SprogrammeExample;

@Service
@Transactional
public class SProgrammeServiceImp implements SProgrammeService {
	
	@Autowired
	public SprogrammeMapper sProgrammeMapper;

	@Override
	public List<Sprogramme> findSProgrammeByPage(int page, int id) {
		SprogrammeExample example= new SprogrammeExample();
		example.createCriteria().andPidEqualTo(id);	
		return sProgrammeMapper.selectByExample(example);
	}

	@Override
	public void addProgramme(Sprogramme sProgramme) {
		
		sProgrammeMapper.insertSelective(sProgramme);
	}

	@Override
	public void updateSProgramme(int id, Sprogramme sProgramme) {
		SprogrammeExample example= new SprogrammeExample();
		example.createCriteria().andIdEqualTo(id);
		sProgrammeMapper.updateByExampleSelective(sProgramme, example);
	}

	@Override
	public void DelectSProgrammeById(int id) {
		sProgrammeMapper.deleteByPrimaryKey(id);
	}
}
