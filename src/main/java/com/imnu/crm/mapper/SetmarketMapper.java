package com.imnu.crm.mapper;

import com.imnu.crm.pojo.Setmarket;
import com.imnu.crm.pojo.SetmarketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetmarketMapper {
    long countByExample(SetmarketExample example);

    int deleteByExample(SetmarketExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Setmarket record);

    int insertSelective(Setmarket record);

    List<Setmarket> selectByExample(SetmarketExample example);

    Setmarket selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Setmarket record, @Param("example") SetmarketExample example);

    int updateByExample(@Param("record") Setmarket record, @Param("example") SetmarketExample example);

    int updateByPrimaryKeySelective(Setmarket record);

    int updateByPrimaryKey(Setmarket record);
    
    double sumSetMarketByMid(int mid);
}