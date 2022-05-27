package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcUser;
import com.gbtech.iaaas.mbg.model.AcUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcUserMapper {
    long countByExample(AcUserExample example);

    int deleteByExample(AcUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcUser record);

    int insertSelective(AcUser record);

    List<AcUser> selectByExample(AcUserExample example);

    AcUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcUser record, @Param("example") AcUserExample example);

    int updateByExample(@Param("record") AcUser record, @Param("example") AcUserExample example);

    int updateByPrimaryKeySelective(AcUser record);

    int updateByPrimaryKey(AcUser record);
}