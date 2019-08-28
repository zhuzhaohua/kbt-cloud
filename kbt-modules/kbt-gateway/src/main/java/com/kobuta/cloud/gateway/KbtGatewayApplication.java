package com.kobuta.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class KbtGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(KbtGatewayApplication.class, args);
    }

}
