package com.kobuta.cloud.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class KbtDemoProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(KbtDemoProviderApplication.class, args);
    }

}
