package com.imnu.crm.mapper;

import com.imnu.crm.pojo.Eorder;
import com.imnu.crm.pojo.EorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EorderMapper {
    long countByExample(EorderExample example);

    int deleteByExample(EorderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Eorder record);

    int insertSelective(Eorder record);

    List<Eorder> selectByExample(EorderExample example);

    Eorder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Eorder record, @Param("example") EorderExample example);

    int updateByExample(@Param("record") Eorder record, @Param("example") EorderExample example);

    int updateByPrimaryKeySelective(Eorder record);

    int updateByPrimaryKey(Eorder record);
}