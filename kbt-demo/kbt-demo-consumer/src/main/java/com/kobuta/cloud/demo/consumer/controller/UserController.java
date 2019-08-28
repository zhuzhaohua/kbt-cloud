package com.kobuta.cloud.demo.consumer.controller;

import com.kobuta.cloud.demo.consumer.entity.User;
import com.kobuta.cloud.demo.consumer.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserFeignClient userFeignClient;

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable int id) {

        return userFeignClient.findById(id);

    }

    @GetMapping("/user/instance")
    public List<ServiceInstance> showInfo() {
        return this.discoveryClient.getInstances("kbt-demo-provider");
    }
}
