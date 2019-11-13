package com.example.rabbitmq;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendController {

    @Resource
    private Sender sender;

    @GetMapping("/send")
    public String sendMessage() {
        sender.send();
        return "success";
    }
}
