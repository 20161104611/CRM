package com.imnu.crm.service;

import java.util.List;

import com.imnu.crm.pojo.Sprogramme;

public interface SProgrammeService {

	List<Sprogramme> findSProgrammeByPage(int page, int id);

	void addProgramme(Sprogramme sProgramme);

	void updateSProgramme(int id, Sprogramme sProgramme);

	void DelectSProgrammeById(int id);

}
