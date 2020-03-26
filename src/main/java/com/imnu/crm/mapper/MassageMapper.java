package com.imnu.crm.mapper;

import com.imnu.crm.pojo.Massage;
import com.imnu.crm.pojo.MassageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MassageMapper {
    long countByExample(MassageExample example);

    int deleteByExample(MassageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Massage record);

    int insertSelective(Massage record);

    List<Massage> selectByExample(MassageExample example);

    Massage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Massage record, @Param("example") MassageExample example);

    int updateByExample(@Param("record") Massage record, @Param("example") MassageExample example);

    int updateByPrimaryKeySelective(Massage record);

    int updateByPrimaryKey(Massage record);
}