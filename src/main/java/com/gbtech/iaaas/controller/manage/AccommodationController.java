package com.gbtech.iaaas.controller.manage;

import com.alibaba.fastjson.JSONObject;
import com.gbtech.iaaas.common.api.ApiRespResult;
import com.gbtech.iaaas.mbg.model.AcBuilding;
import com.gbtech.iaaas.service.AccommodationService;
import com.gbtech.iaaas.common.ApiResponseUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manage/accommodation")
public class AccommodationController {

    @Autowired
    private AccommodationService accommodationService;

    private static final Logger logger = LoggerFactory.getLogger(AccommodationController.class);


    @RequestMapping(method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ApiRespResult createAccommodation(@RequestBody AcBuilding acBuilding) {
        ApiRespResult apiRespResult;
        logger.info("Request Interface: '/manage/accommodation', " + "Request Content: " + acBuilding);
        int count = accommodationService.createAccommodation(acBuilding);
        if (count == 1) {
            apiRespResult = ApiRespResult.success(acBuilding, "创建公寓成功");
            logger.info("Create a new accommodation successful: {}", acBuilding);
        } else {
            apiRespResult = ApiRespResult.failed("创建公寓失败");
            logger.info("Create a new accommodation failed: {}", acBuilding);
        }
        return apiRespResult;
    }
}
