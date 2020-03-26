package com.imnu.crm.service;

import java.util.List;

import com.imnu.crm.pojo.ERecord;

public interface ERecordService {

	void addERecord(ERecord eRecord);

	List<ERecord> findUserByPage(int page, int id);

}
