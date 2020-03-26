package com.imnu.crm.service;

import java.util.List;

import com.imnu.crm.pojo.Contract;

public interface ContractService {

	void addERecord(Contract contract);

	List<Contract> findContractByPage(int page);

	void DelectContractById(int id);

	void updateContract(int id, Contract contract);

}
