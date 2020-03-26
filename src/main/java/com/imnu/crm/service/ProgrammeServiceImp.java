package com.imnu.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imnu.crm.mapper.ProgrammeMapper;
import com.imnu.crm.pojo.Programme;
import com.imnu.crm.pojo.ProgrammeExample;

@Service
@Transactional
public class ProgrammeServiceImp implements ProgrammeService {
	
	@Autowired
	public ProgrammeMapper programmeMapper;

	@Override
	public void addProgramme(Programme programme) {
		
		programmeMapper.insertSelective(programme);
	}

	@Override
	public List<Programme> findProgrammeByPage(int page) {
		ProgrammeExample example=new ProgrammeExample();
		return programmeMapper.selectByExample(example);
	}

	@Override
	public void DelectProgrammeById(int id) {
		
		programmeMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateProgramme(int id, Programme programme) {
		ProgrammeExample example=new ProgrammeExample();
		example.createCriteria().andIdEqualTo(id);
		programmeMapper.updateByExampleSelective(programme, example);
	}
}
