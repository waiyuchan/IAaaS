package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcInvoice;
import com.gbtech.iaaas.mbg.model.AcInvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcInvoiceMapper {
    long countByExample(AcInvoiceExample example);

    int deleteByExample(AcInvoiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcInvoice record);

    int insertSelective(AcInvoice record);

    List<AcInvoice> selectByExampleWithBLOBs(AcInvoiceExample example);

    List<AcInvoice> selectByExample(AcInvoiceExample example);

    AcInvoice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcInvoice record, @Param("example") AcInvoiceExample example);

    int updateByExampleWithBLOBs(@Param("record") AcInvoice record, @Param("example") AcInvoiceExample example);

    int updateByExample(@Param("record") AcInvoice record, @Param("example") AcInvoiceExample example);

    int updateByPrimaryKeySelective(AcInvoice record);

    int updateByPrimaryKeyWithBLOBs(AcInvoice record);

    int updateByPrimaryKey(AcInvoice record);
}