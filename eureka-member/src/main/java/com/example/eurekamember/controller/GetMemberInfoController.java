package com.example.eurekamember.controller;

import com.example.eurekamember.entity.Beauty;
import com.example.eurekamember.mapper.UserMapper;
import com.example.eurekamember.utils.RedisUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api("会员服务接口")
@RefreshScope
@RestController
public class GetMemberInfoController {

    @Resource
    private UserMapper userMapper;

    @Resource
    private RedisUtils redisUtils;

    @Value("${spring.application.name}")
    private String serverName;

    @Value("${server.port}")
    private String serverPort;

    @Value("${age}")
    private String originAge;

    @ApiOperation("获取会员相关信息")
    @GetMapping("/getMemberInfo")
    public Beauty getMemberInfo(String _id) {
        // return "服务名: " + serverName + "    端口: " + serverPort + "  年龄：" + originAge;
        System.out.println(redisUtils.get("1"));
        return userMapper.getBeauty(_id);
    }

    @ApiOperation("插入会员相关信息")
    @GetMapping("/addMemberInfo")
    public String addMemberInfo(String type, String _desc) {
        try {
            userMapper.insertBeauty(type, _desc);
            redisUtils.set(type, _desc);
        } catch (Exception e) {
            e.printStackTrace();
            return "失败";
        }
        return "成功";
    }
}
