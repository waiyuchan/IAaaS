package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcWallet;
import com.gbtech.iaaas.mbg.model.AcWalletExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcWalletMapper {
    long countByExample(AcWalletExample example);

    int deleteByExample(AcWalletExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcWallet record);

    int insertSelective(AcWallet record);

    List<AcWallet> selectByExample(AcWalletExample example);

    AcWallet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcWallet record, @Param("example") AcWalletExample example);

    int updateByExample(@Param("record") AcWallet record, @Param("example") AcWalletExample example);

    int updateByPrimaryKeySelective(AcWallet record);

    int updateByPrimaryKey(AcWallet record);
}