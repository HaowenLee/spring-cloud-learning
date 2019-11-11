package com.example.eurekaorder.api.controller;

import com.example.eurekaorder.api.services.GetOrderInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class GetOrderInfoController {

    @Resource
    private GetOrderInfoService service;

    @GetMapping("/getOrderInfo")
    public String getOrderInfo() {
        return service.getOrderInfo();
    }
}
