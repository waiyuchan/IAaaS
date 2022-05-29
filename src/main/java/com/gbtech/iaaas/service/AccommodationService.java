package com.gbtech.iaaas.service;

import com.gbtech.iaaas.mbg.model.AcBuilding;
import com.gbtech.iaaas.mbg.model.AeStaff;
import java.util.List;

public interface AccommodationService {

    int createAccommodation(AcBuilding acBuilding);

    List<AcBuilding> getAccommodationList(int pageNum, int pageSize);


}
