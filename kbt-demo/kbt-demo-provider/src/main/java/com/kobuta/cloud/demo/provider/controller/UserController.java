package com.kobuta.cloud.demo.provider.controller;

import com.kobuta.cloud.demo.provider.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RefreshScope
@RestController
public class UserController {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${test.prop}")
    String prop;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable int id) {

        User user = null;

        switch (id) {
            case 1:
                user = new User(1, prop, 30);
                break;
            case 2:
                user = new User(2, prop, 31);
                break;
            default:
                user = new User(0, "---", 0);

        }

        log.info("this server");

        return user;

    }

    @GetMapping("/send/{id}")
    public String send(@PathVariable int id) {
        String context = id ++ + ">>>hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);

        return "send:" +  id;
    }
}
