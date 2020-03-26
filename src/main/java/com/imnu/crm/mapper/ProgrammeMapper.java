package com.imnu.crm.mapper;

import com.imnu.crm.pojo.Programme;
import com.imnu.crm.pojo.ProgrammeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProgrammeMapper {
    long countByExample(ProgrammeExample example);

    int deleteByExample(ProgrammeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Programme record);

    int insertSelective(Programme record);

    List<Programme> selectByExample(ProgrammeExample example);

    Programme selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Programme record, @Param("example") ProgrammeExample example);

    int updateByExample(@Param("record") Programme record, @Param("example") ProgrammeExample example);

    int updateByPrimaryKeySelective(Programme record);

    int updateByPrimaryKey(Programme record);
}