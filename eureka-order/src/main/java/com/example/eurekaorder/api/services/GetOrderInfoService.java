package com.example.eurekaorder.api.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Component
public class GetOrderInfoService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String getOrderInfo() {
        return "RestTemplate+负载均衡 调用方式，调用eureka-member的getMemberInfo 结果:" + restTemplate.getForObject("http://eureka-member/getMemberInfo", String.class);
    }

    public String fallback(){
        return "服务降级提示";
    }
}
