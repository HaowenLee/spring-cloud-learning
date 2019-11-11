package com.example.eurekaorderfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-member")
public interface GetMemberInfoClient {

    @GetMapping("/getMemberInfo")
    String getMemberInfo();
}
