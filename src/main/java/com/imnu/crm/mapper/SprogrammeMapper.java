package com.imnu.crm.mapper;

import com.imnu.crm.pojo.Sprogramme;
import com.imnu.crm.pojo.SprogrammeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SprogrammeMapper {
    long countByExample(SprogrammeExample example);

    int deleteByExample(SprogrammeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sprogramme record);

    int insertSelective(Sprogramme record);

    List<Sprogramme> selectByExample(SprogrammeExample example);

    Sprogramme selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sprogramme record, @Param("example") SprogrammeExample example);

    int updateByExample(@Param("record") Sprogramme record, @Param("example") SprogrammeExample example);

    int updateByPrimaryKeySelective(Sprogramme record);

    int updateByPrimaryKey(Sprogramme record);
}