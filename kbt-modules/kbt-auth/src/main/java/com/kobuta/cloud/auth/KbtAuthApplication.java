package com.kobuta.cloud.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class KbtAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(KbtAuthApplication.class, args);
    }

}
