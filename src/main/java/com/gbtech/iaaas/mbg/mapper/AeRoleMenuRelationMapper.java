package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AeRoleMenuRelation;
import com.gbtech.iaaas.mbg.model.AeRoleMenuRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AeRoleMenuRelationMapper {
    long countByExample(AeRoleMenuRelationExample example);

    int deleteByExample(AeRoleMenuRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AeRoleMenuRelation record);

    int insertSelective(AeRoleMenuRelation record);

    List<AeRoleMenuRelation> selectByExample(AeRoleMenuRelationExample example);

    AeRoleMenuRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AeRoleMenuRelation record, @Param("example") AeRoleMenuRelationExample example);

    int updateByExample(@Param("record") AeRoleMenuRelation record, @Param("example") AeRoleMenuRelationExample example);

    int updateByPrimaryKeySelective(AeRoleMenuRelation record);

    int updateByPrimaryKey(AeRoleMenuRelation record);
}