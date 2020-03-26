package com.imnu.crm.service;

import java.util.List;

import com.imnu.crm.pojo.Programme;

public interface ProgrammeService {

	void addProgramme(Programme programme);

	List<Programme> findProgrammeByPage(int page);

	void DelectProgrammeById(int id);

	void updateProgramme(int id, Programme programme);

}
