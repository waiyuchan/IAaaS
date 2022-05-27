package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcPublicAccessControl;
import com.gbtech.iaaas.mbg.model.AcPublicAccessControlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcPublicAccessControlMapper {
    long countByExample(AcPublicAccessControlExample example);

    int deleteByExample(AcPublicAccessControlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcPublicAccessControl record);

    int insertSelective(AcPublicAccessControl record);

    List<AcPublicAccessControl> selectByExample(AcPublicAccessControlExample example);

    AcPublicAccessControl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcPublicAccessControl record, @Param("example") AcPublicAccessControlExample example);

    int updateByExample(@Param("record") AcPublicAccessControl record, @Param("example") AcPublicAccessControlExample example);

    int updateByPrimaryKeySelective(AcPublicAccessControl record);

    int updateByPrimaryKey(AcPublicAccessControl record);
}