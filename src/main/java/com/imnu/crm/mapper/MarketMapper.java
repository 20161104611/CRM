package com.imnu.crm.mapper;

import com.imnu.crm.pojo.Market;
import com.imnu.crm.pojo.MarketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketMapper {
    long countByExample(MarketExample example);

    int deleteByExample(MarketExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Market record);

    int insertSelective(Market record);

    List<Market> selectByExample(MarketExample example);

    Market selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Market record, @Param("example") MarketExample example);

    int updateByExample(@Param("record") Market record, @Param("example") MarketExample example);

    int updateByPrimaryKeySelective(Market record);

    int updateByPrimaryKey(Market record);
}