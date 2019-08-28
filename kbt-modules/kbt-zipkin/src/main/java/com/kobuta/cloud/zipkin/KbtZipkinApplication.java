package com.kobuta.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class KbtZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(KbtZipkinApplication.class, args);
    }

}
