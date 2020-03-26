package com.imnu.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imnu.crm.mapper.ClientsMapper;
import com.imnu.crm.pojo.Clients;
import com.imnu.crm.pojo.ClientsExample;

@Service
@Transactional
public class ClientsServiceImp implements ClientsService {

	@Autowired
	public ClientsMapper clientsMapper;
	
	
	@Override
	public List<Clients> findUserByPage(int page) {
		
		ClientsExample example = new ClientsExample();
		return clientsMapper.selectByExample(example);
	}

	@Override
	public void addClients(Clients clients) {
		
		clientsMapper.insertSelective(clients);
	}

	
	@Override
	public void DelectClientsById(int id) {
		ClientsExample example = new ClientsExample();
		example.createCriteria().andIdEqualTo(id);	
		System.out.println(id);
		clientsMapper.deleteByExample(example);
	}

	@Override
	public void updateClientsZT(Clients clients,int id) {
		ClientsExample example = new ClientsExample();
		example.createCriteria().andIdEqualTo(id);
		clientsMapper.updateByExampleSelective(clients, example);
	}

	
}
