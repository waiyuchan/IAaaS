package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcContract;
import com.gbtech.iaaas.mbg.model.AcContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcContractMapper {
    long countByExample(AcContractExample example);

    int deleteByExample(AcContractExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcContract record);

    int insertSelective(AcContract record);

    List<AcContract> selectByExampleWithBLOBs(AcContractExample example);

    List<AcContract> selectByExample(AcContractExample example);

    AcContract selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcContract record, @Param("example") AcContractExample example);

    int updateByExampleWithBLOBs(@Param("record") AcContract record, @Param("example") AcContractExample example);

    int updateByExample(@Param("record") AcContract record, @Param("example") AcContractExample example);

    int updateByPrimaryKeySelective(AcContract record);

    int updateByPrimaryKeyWithBLOBs(AcContract record);

    int updateByPrimaryKey(AcContract record);
}