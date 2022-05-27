package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcWalletCardLink;
import com.gbtech.iaaas.mbg.model.AcWalletCardLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcWalletCardLinkMapper {
    long countByExample(AcWalletCardLinkExample example);

    int deleteByExample(AcWalletCardLinkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcWalletCardLink record);

    int insertSelective(AcWalletCardLink record);

    List<AcWalletCardLink> selectByExample(AcWalletCardLinkExample example);

    AcWalletCardLink selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcWalletCardLink record, @Param("example") AcWalletCardLinkExample example);

    int updateByExample(@Param("record") AcWalletCardLink record, @Param("example") AcWalletCardLinkExample example);

    int updateByPrimaryKeySelective(AcWalletCardLink record);

    int updateByPrimaryKey(AcWalletCardLink record);
}