package com.kobuta.cloud.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableCircuitBreaker
@SpringBootApplication
public class KbtDemoConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KbtDemoConsumerApplication.class, args);
    }

}
