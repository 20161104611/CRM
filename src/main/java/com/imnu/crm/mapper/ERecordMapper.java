package com.imnu.crm.mapper;

import com.imnu.crm.pojo.ERecord;
import com.imnu.crm.pojo.ERecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ERecordMapper {
    long countByExample(ERecordExample example);

    int deleteByExample(ERecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ERecord record);

    int insertSelective(ERecord record);

    List<ERecord> selectByExample(ERecordExample example);

    ERecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ERecord record, @Param("example") ERecordExample example);

    int updateByExample(@Param("record") ERecord record, @Param("example") ERecordExample example);

    int updateByPrimaryKeySelective(ERecord record);

    int updateByPrimaryKey(ERecord record);
}