package com.imnu.crm.service;

import java.util.List;

import com.imnu.crm.pojo.Smassage;

public interface SmassageService {

	List<Smassage> findMassageAllByPage(int page);

	void addSMassage(Smassage sMassage);

}
