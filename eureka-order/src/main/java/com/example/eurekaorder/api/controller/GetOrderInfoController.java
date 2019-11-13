package com.example.eurekaorder.api.controller;

import com.example.eurekaorder.api.services.GetOrderInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Api("订单服务接口")
@RestController
public class GetOrderInfoController {

    @Resource
    private GetOrderInfoService service;

    @ApiOperation("获取订单相关信息")
    @GetMapping("/getOrderInfo")
    public String getOrderInfo() {
        return service.getOrderInfo();
    }
}
