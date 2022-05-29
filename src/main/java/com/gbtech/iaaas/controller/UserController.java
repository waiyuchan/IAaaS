package com.gbtech.iaaas.controller;

import com.gbtech.iaaas.common.api.Result;
import com.gbtech.iaaas.controller.manage.AccommodationController;
import com.gbtech.iaaas.mbg.model.AcBuilding;
import com.gbtech.iaaas.mbg.model.AcUser;
import com.gbtech.iaaas.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "AccommodationController", description = "住户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    private static final Logger logger = LoggerFactory.getLogger(AccommodationController.class);

    @ApiOperation("创建住户")
    @RequestMapping(method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Result registerUser(@RequestBody AcUser user) {
        Result result;
        logger.info(
                "Request Interface: '/user', " + "Request Content: " + user.toString());
        int count = userService.registerUser(user);
        if (count == 1) {
            result = Result.success(user, "创建住户成功");
            logger.info("Create a new accommodation successful: {}", user);
        } else {
            result = Result.failed("创建住户失败");
            logger.info("Create a new accommodation failed: {}", user);
        }
        return result;
    }

}
