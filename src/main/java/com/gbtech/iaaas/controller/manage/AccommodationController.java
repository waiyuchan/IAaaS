package com.gbtech.iaaas.controller.manage;

import com.gbtech.iaaas.common.api.Paginator;
import com.gbtech.iaaas.common.api.Result;
import com.gbtech.iaaas.mbg.model.AcBuilding;
import com.gbtech.iaaas.service.AccommodationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "AccommodationController", description = "公寓楼管理")
@RestController
@RequestMapping("/manage/accommodation")
public class AccommodationController {

    @Autowired
    private AccommodationService accommodationService;

    private static final Logger logger = LoggerFactory.getLogger(AccommodationController.class);

    @ApiOperation("创建公寓")
    @RequestMapping(method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Result createAccommodation(@RequestBody AcBuilding building) {
        Result result;
        logger.info(
                "Request Interface: '/manage/accommodation', " + "Request Content: "
                        + building.toString());
        int count = accommodationService.createAccommodation(building);
        if (count == 1) {
            result = Result.success(building, "创建公寓成功");
            logger.info("Create a new accommodation successful: {}", building);
        } else {
            result = Result.failed("创建公寓失败");
            logger.info("Create a new accommodation failed: {}", building);
        }
        return result;
    }

    @ApiOperation("获取公寓列表")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result<Paginator<AcBuilding>> getStaffList(
            @RequestParam(value = "pageNum", defaultValue = "1")
            @ApiParam("页码") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10")
            @ApiParam("每页数量") Integer pageSize) {
        List<AcBuilding> buildingList = accommodationService.getAccommodationList(pageNum,
                pageSize);
        logger.info("Request Interface: '/manage/staff'");
        logger.info("Get staff list successful: {}", buildingList.toString());
        return Result.success(Paginator.restPage(buildingList), "获取员工列表成功");
    }
}
