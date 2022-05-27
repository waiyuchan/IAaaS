package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcRoom;
import com.gbtech.iaaas.mbg.model.AcRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcRoomMapper {
    long countByExample(AcRoomExample example);

    int deleteByExample(AcRoomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcRoom record);

    int insertSelective(AcRoom record);

    List<AcRoom> selectByExampleWithBLOBs(AcRoomExample example);

    List<AcRoom> selectByExample(AcRoomExample example);

    AcRoom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcRoom record, @Param("example") AcRoomExample example);

    int updateByExampleWithBLOBs(@Param("record") AcRoom record, @Param("example") AcRoomExample example);

    int updateByExample(@Param("record") AcRoom record, @Param("example") AcRoomExample example);

    int updateByPrimaryKeySelective(AcRoom record);

    int updateByPrimaryKeyWithBLOBs(AcRoom record);

    int updateByPrimaryKey(AcRoom record);
}