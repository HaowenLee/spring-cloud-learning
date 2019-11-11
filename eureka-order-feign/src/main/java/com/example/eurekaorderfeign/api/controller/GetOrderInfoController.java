package com.example.eurekaorderfeign.api.controller;

import com.example.eurekaorderfeign.GetMemberInfoClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class GetOrderInfoController {

    @Resource
    GetMemberInfoClient client;

    @GetMapping("/getOrderInfo")
    public String getOrderInfo() {
        return "RestTemplate+负载均衡 调用方式，调用eureka-member的getMemberInfo 结果:" + client.getMemberInfo();
    }
}
