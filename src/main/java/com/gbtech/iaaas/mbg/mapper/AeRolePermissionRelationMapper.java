package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AeRolePermissionRelation;
import com.gbtech.iaaas.mbg.model.AeRolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AeRolePermissionRelationMapper {
    long countByExample(AeRolePermissionRelationExample example);

    int deleteByExample(AeRolePermissionRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AeRolePermissionRelation record);

    int insertSelective(AeRolePermissionRelation record);

    List<AeRolePermissionRelation> selectByExample(AeRolePermissionRelationExample example);

    AeRolePermissionRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AeRolePermissionRelation record, @Param("example") AeRolePermissionRelationExample example);

    int updateByExample(@Param("record") AeRolePermissionRelation record, @Param("example") AeRolePermissionRelationExample example);

    int updateByPrimaryKeySelective(AeRolePermissionRelation record);

    int updateByPrimaryKey(AeRolePermissionRelation record);
}