package com.kobuta.cloud.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@Slf4j
@SpringBootApplication
@EnableEurekaServer
public class KbtEurekaApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(KbtEurekaApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

}
