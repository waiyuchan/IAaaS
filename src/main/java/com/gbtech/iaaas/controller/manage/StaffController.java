package com.gbtech.iaaas.controller.manage;

import com.gbtech.iaaas.common.api.Paginator;
import com.gbtech.iaaas.common.api.Result;
import com.gbtech.iaaas.dto.StaffLoginParam;
import com.gbtech.iaaas.dto.StaffRegisterReturn;
import com.gbtech.iaaas.mbg.model.AeStaff;
import com.gbtech.iaaas.service.StaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Api(tags = "StaffController", description = "企业人员管理")
@RestController
@RequestMapping("/manage/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    private static final Logger logger = LoggerFactory.getLogger(StaffController.class);

    @ApiOperation("注册新员工")
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Result registerStaff(@RequestBody AeStaff aeStaff) {
        logger.info("Request Interface: '/manage/staff', " + "Content: " + aeStaff.toString());
        StaffRegisterReturn staff = staffService.registerStaff(aeStaff);
        if (staff == null) {
            logger.info("Register a new staff failed: {}", aeStaff);
            Result.failed("注册新员工失败");
        }
        logger.info("Register a new staff successful: {}", aeStaff);
        return Result.success(staff, "注册新员工成功");
    }

    @ApiOperation("获取员工列表")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result<Paginator<AeStaff>> getStaffList(
            @RequestParam(value = "pageNum", defaultValue = "1")
            @ApiParam("页码") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10")
            @ApiParam("每页数量") Integer pageSize) {
        List<AeStaff> staffList = staffService.getStaffList(pageNum, pageSize);
        logger.info("Request Interface: '/manage/staff'");
        logger.info("Get staff list successful: {}", staffList.toString());
        return Result.success(Paginator.restPage(staffList), "获取员工列表成功");
    }

    @ApiOperation("员工登陆并获取token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result loginStaff(@RequestBody StaffLoginParam staffLoginParam,
            BindingResult bindingResult) {
        logger.info("登陆信息: {}", staffLoginParam.toString());
        String token = staffService.login(staffLoginParam.getUsername(),
                staffLoginParam.getPassword());
        if (token == null) {
            return Result.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return Result.success(tokenMap);
    }

}
