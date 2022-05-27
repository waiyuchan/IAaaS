package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcRoomAccessControl;
import com.gbtech.iaaas.mbg.model.AcRoomAccessControlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcRoomAccessControlMapper {
    long countByExample(AcRoomAccessControlExample example);

    int deleteByExample(AcRoomAccessControlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcRoomAccessControl record);

    int insertSelective(AcRoomAccessControl record);

    List<AcRoomAccessControl> selectByExample(AcRoomAccessControlExample example);

    AcRoomAccessControl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcRoomAccessControl record, @Param("example") AcRoomAccessControlExample example);

    int updateByExample(@Param("record") AcRoomAccessControl record, @Param("example") AcRoomAccessControlExample example);

    int updateByPrimaryKeySelective(AcRoomAccessControl record);

    int updateByPrimaryKey(AcRoomAccessControl record);
}