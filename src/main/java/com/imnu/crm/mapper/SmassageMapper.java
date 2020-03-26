package com.imnu.crm.mapper;

import com.imnu.crm.pojo.Smassage;
import com.imnu.crm.pojo.SmassageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmassageMapper {
    long countByExample(SmassageExample example);

    int deleteByExample(SmassageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Smassage record);

    int insertSelective(Smassage record);

    List<Smassage> selectByExample(SmassageExample example);

    Smassage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Smassage record, @Param("example") SmassageExample example);

    int updateByExample(@Param("record") Smassage record, @Param("example") SmassageExample example);

    int updateByPrimaryKeySelective(Smassage record);

    int updateByPrimaryKey(Smassage record);
}