package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcAccessRecord;
import com.gbtech.iaaas.mbg.model.AcAccessRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcAccessRecordMapper {
    long countByExample(AcAccessRecordExample example);

    int deleteByExample(AcAccessRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcAccessRecord record);

    int insertSelective(AcAccessRecord record);

    List<AcAccessRecord> selectByExample(AcAccessRecordExample example);

    AcAccessRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcAccessRecord record, @Param("example") AcAccessRecordExample example);

    int updateByExample(@Param("record") AcAccessRecord record, @Param("example") AcAccessRecordExample example);

    int updateByPrimaryKeySelective(AcAccessRecord record);

    int updateByPrimaryKey(AcAccessRecord record);
}