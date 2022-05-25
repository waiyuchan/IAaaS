package com.gbtech.iaaas.controller.manage;

import com.alibaba.fastjson.JSONObject;
import com.gbtech.iaaas.service.AccommodationService;
import com.gbtech.iaaas.common.ApiResponseUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manage/accommodation")
public class AccommodationController {

    private static final Logger logger = Logger.getLogger(AccommodationController.class);

    @Autowired
    private AccommodationService accommodationService;

    @RequestMapping(method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String createAccommodation(@RequestBody JSONObject requestBody) {
        logger.info("Request Interface: '/manage/accommodation', " + "Request Content: " + requestBody);
        boolean createStatus = accommodationService.createAccommodation(requestBody);
        if (createStatus) {
            logger.info("Request Success.");
            return ApiResponseUtils.success("");
        } else {
            return ApiResponseUtils.error(203, "创建公寓失败。");
        }

    }
}
