package com.kobuta.cloud.demo.consumer.feign.fallback;

import com.kobuta.cloud.demo.consumer.entity.User;
import com.kobuta.cloud.demo.consumer.feign.UserFeignClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserFeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserFeignClientFallbackFactory.class);

    @Override
    public UserFeignClient create(Throwable throwable) {
        return id -> {
            UserFeignClientFallbackFactory.LOGGER.error("fallback："+ throwable.getLocalizedMessage());

            return  new User(-1, "error",100);
        };
    }
}
