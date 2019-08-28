package com.kobuta.cloud.demo.consumer.feign;

import com.kobuta.cloud.demo.consumer.entity.User;
import com.kobuta.cloud.demo.consumer.feign.fallback.UserFeignClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="kbt-demo-provider", fallbackFactory = UserFeignClientFallbackFactory.class)
public interface UserFeignClient {

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    User findById(@PathVariable("id") int id);
}