package com.imnu.crm.mapper;

import com.imnu.crm.pojo.Sorder;
import com.imnu.crm.pojo.SorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SorderMapper {
    long countByExample(SorderExample example);

    int deleteByExample(SorderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sorder record);

    int insertSelective(Sorder record);

    List<Sorder> selectByExample(SorderExample example);

    Sorder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sorder record, @Param("example") SorderExample example);

    int updateByExample(@Param("record") Sorder record, @Param("example") SorderExample example);

    int updateByPrimaryKeySelective(Sorder record);

    int updateByPrimaryKey(Sorder record);
    
    double sumSorderByEid(int eid);
}