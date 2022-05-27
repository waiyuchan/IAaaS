package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcDepositAndWithdrawal;
import com.gbtech.iaaas.mbg.model.AcDepositAndWithdrawalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcDepositAndWithdrawalMapper {
    long countByExample(AcDepositAndWithdrawalExample example);

    int deleteByExample(AcDepositAndWithdrawalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcDepositAndWithdrawal record);

    int insertSelective(AcDepositAndWithdrawal record);

    List<AcDepositAndWithdrawal> selectByExample(AcDepositAndWithdrawalExample example);

    AcDepositAndWithdrawal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcDepositAndWithdrawal record, @Param("example") AcDepositAndWithdrawalExample example);

    int updateByExample(@Param("record") AcDepositAndWithdrawal record, @Param("example") AcDepositAndWithdrawalExample example);

    int updateByPrimaryKeySelective(AcDepositAndWithdrawal record);

    int updateByPrimaryKey(AcDepositAndWithdrawal record);
}