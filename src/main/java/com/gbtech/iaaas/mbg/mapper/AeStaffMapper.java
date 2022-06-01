package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AeStaff;
import com.gbtech.iaaas.mbg.model.AeStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AeStaffMapper {
    long countByExample(AeStaffExample example);

    int deleteByExample(AeStaffExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AeStaff record);

    int insertSelective(AeStaff record);

    List<AeStaff> selectByExample(AeStaffExample example);

    AeStaff selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AeStaff record, @Param("example") AeStaffExample example);

    int updateByExample(@Param("record") AeStaff record, @Param("example") AeStaffExample example);

    int updateByPrimaryKeySelective(AeStaff record);

    int updateByPrimaryKey(AeStaff record);
}