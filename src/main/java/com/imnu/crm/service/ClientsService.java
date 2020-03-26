package com.imnu.crm.service;

import java.util.List;

import com.imnu.crm.pojo.Clients;

public interface ClientsService {

	List<Clients> findUserByPage(int page);

	void addClients(Clients clients);

	void DelectClientsById(int id);

	void updateClientsZT(Clients clients, int id);

	
}
