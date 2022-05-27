package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcTransaction;
import com.gbtech.iaaas.mbg.model.AcTransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcTransactionMapper {
    long countByExample(AcTransactionExample example);

    int deleteByExample(AcTransactionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcTransaction record);

    int insertSelective(AcTransaction record);

    List<AcTransaction> selectByExample(AcTransactionExample example);

    AcTransaction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcTransaction record, @Param("example") AcTransactionExample example);

    int updateByExample(@Param("record") AcTransaction record, @Param("example") AcTransactionExample example);

    int updateByPrimaryKeySelective(AcTransaction record);

    int updateByPrimaryKey(AcTransaction record);
}