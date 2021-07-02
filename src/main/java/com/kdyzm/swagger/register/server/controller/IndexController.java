package com.kdyzm.swagger.register.server.controller;

import com.kdyzm.swagger.register.server.model.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kdyzm
 * @date 2021/7/1
 */
@RestController
@Slf4j
@RequestMapping("/base")
@Api(tags = "主页接口集合")
public class IndexController {


    @ApiOperation("测试接口")
    @GetMapping("/test")
    public Result<String> test(@RequestParam(value = "str", required = true) String str) {
        return Result.ok("Hello,world");
    }

}
