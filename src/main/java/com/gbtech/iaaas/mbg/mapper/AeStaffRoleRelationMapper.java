package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AeStaffRoleRelation;
import com.gbtech.iaaas.mbg.model.AeStaffRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AeStaffRoleRelationMapper {
    long countByExample(AeStaffRoleRelationExample example);

    int deleteByExample(AeStaffRoleRelationExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(AeStaffRoleRelation record);

    int insertSelective(AeStaffRoleRelation record);

    List<AeStaffRoleRelation> selectByExample(AeStaffRoleRelationExample example);

    AeStaffRoleRelation selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") AeStaffRoleRelation record, @Param("example") AeStaffRoleRelationExample example);

    int updateByExample(@Param("record") AeStaffRoleRelation record, @Param("example") AeStaffRoleRelationExample example);

    int updateByPrimaryKeySelective(AeStaffRoleRelation record);

    int updateByPrimaryKey(AeStaffRoleRelation record);
}