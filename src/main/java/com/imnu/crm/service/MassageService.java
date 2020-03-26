package com.imnu.crm.service;

import java.util.List;

import com.imnu.crm.pojo.Massage;

public interface MassageService {

	void addMassage(Massage massage);

	List<Massage> findMassageByPage(int page, int mid);

	void DelectMassageById(int id);

	List<Massage> findMassageAllByPage(int page);

	

}
