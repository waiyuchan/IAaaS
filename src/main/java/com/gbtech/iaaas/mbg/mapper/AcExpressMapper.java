package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcExpress;
import com.gbtech.iaaas.mbg.model.AcExpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcExpressMapper {
    long countByExample(AcExpressExample example);

    int deleteByExample(AcExpressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcExpress record);

    int insertSelective(AcExpress record);

    List<AcExpress> selectByExampleWithBLOBs(AcExpressExample example);

    List<AcExpress> selectByExample(AcExpressExample example);

    AcExpress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcExpress record, @Param("example") AcExpressExample example);

    int updateByExampleWithBLOBs(@Param("record") AcExpress record, @Param("example") AcExpressExample example);

    int updateByExample(@Param("record") AcExpress record, @Param("example") AcExpressExample example);

    int updateByPrimaryKeySelective(AcExpress record);

    int updateByPrimaryKeyWithBLOBs(AcExpress record);

    int updateByPrimaryKey(AcExpress record);
}