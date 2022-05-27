package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcFeeOrder;
import com.gbtech.iaaas.mbg.model.AcFeeOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcFeeOrderMapper {
    long countByExample(AcFeeOrderExample example);

    int deleteByExample(AcFeeOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcFeeOrder record);

    int insertSelective(AcFeeOrder record);

    List<AcFeeOrder> selectByExampleWithBLOBs(AcFeeOrderExample example);

    List<AcFeeOrder> selectByExample(AcFeeOrderExample example);

    AcFeeOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcFeeOrder record, @Param("example") AcFeeOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") AcFeeOrder record, @Param("example") AcFeeOrderExample example);

    int updateByExample(@Param("record") AcFeeOrder record, @Param("example") AcFeeOrderExample example);

    int updateByPrimaryKeySelective(AcFeeOrder record);

    int updateByPrimaryKeyWithBLOBs(AcFeeOrder record);

    int updateByPrimaryKey(AcFeeOrder record);
}