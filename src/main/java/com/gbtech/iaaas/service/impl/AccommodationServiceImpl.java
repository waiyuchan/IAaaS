package com.gbtech.iaaas.service.impl;

import com.gbtech.iaaas.mbg.mapper.AcBuildingMapper;
import com.gbtech.iaaas.mbg.model.AcBuilding;
import com.gbtech.iaaas.service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AccommodationServiceImpl")
public class AccommodationServiceImpl implements AccommodationService {

    @Autowired
    private AcBuildingMapper acBuildingMapper;

    @Override
    public int createAccommodation(AcBuilding acBuilding) {
        return acBuildingMapper.insertSelective(acBuilding);
    }

}
