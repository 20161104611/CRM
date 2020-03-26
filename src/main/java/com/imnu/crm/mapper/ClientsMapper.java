package com.imnu.crm.mapper;

import com.imnu.crm.pojo.Clients;
import com.imnu.crm.pojo.ClientsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientsMapper {
    long countByExample(ClientsExample example);

    int deleteByExample(ClientsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Clients record);

    int insertSelective(Clients record);

    List<Clients> selectByExample(ClientsExample example);

    Clients selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Clients record, @Param("example") ClientsExample example);

    int updateByExample(@Param("record") Clients record, @Param("example") ClientsExample example);

    int updateByPrimaryKeySelective(Clients record);

    int updateByPrimaryKey(Clients record);
}