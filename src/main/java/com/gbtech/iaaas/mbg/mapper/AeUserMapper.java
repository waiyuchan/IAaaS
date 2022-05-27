package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AeUser;
import com.gbtech.iaaas.mbg.model.AeUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AeUserMapper {
    long countByExample(AeUserExample example);

    int deleteByExample(AeUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AeUser record);

    int insertSelective(AeUser record);

    List<AeUser> selectByExample(AeUserExample example);

    AeUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AeUser record, @Param("example") AeUserExample example);

    int updateByExample(@Param("record") AeUser record, @Param("example") AeUserExample example);

    int updateByPrimaryKeySelective(AeUser record);

    int updateByPrimaryKey(AeUser record);
}