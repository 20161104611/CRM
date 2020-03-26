package com.imnu.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imnu.crm.mapper.ContractMapper;
import com.imnu.crm.pojo.Contract;
import com.imnu.crm.pojo.ContractExample;

@Service
@Transactional
public class ContractServiceImp implements ContractService {

	@Autowired
	public ContractMapper contractMapper;

	@Override
	public void addERecord(Contract contract) {
		contractMapper.insertSelective(contract);
	}

	@Override
	public List<Contract> findContractByPage(int page) {
		ContractExample example = new ContractExample();
		return contractMapper.selectByExample(example);
	}

	@Override
	public void DelectContractById(int id) {
		ContractExample example = new ContractExample();
		example.createCriteria().andIdEqualTo(id);	
		System.out.println(id);
		contractMapper.deleteByExample(example);
	}

	@Override
	public void updateContract(int id, Contract contract) {
		
		ContractExample example = new ContractExample();
		example.createCriteria().andIdEqualTo(id);
		
		contractMapper.updateByExampleSelective(contract, example);
	}

	
}
