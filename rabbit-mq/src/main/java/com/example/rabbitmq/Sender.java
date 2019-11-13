package com.example.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
public class Sender {

    @Resource
    private AmqpTemplate rabbitTemplate;

    void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        rabbitTemplate.convertAndSend("hello", context);
    }
}
