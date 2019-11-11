package com.example.eurekamember.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class GetMemberInfoController {

    @Value("${spring.application.name}")
    private String serverName;

    @Value("${server.port}")
    private String serverPort;

    @Value("${age}")
    private String originAge;

    @GetMapping("/getMemberInfo")
    public String getMemberInfo() throws InterruptedException {
        return "服务名: " + serverName + "    端口: " + serverPort + "  年龄：" + originAge;
    }
}
