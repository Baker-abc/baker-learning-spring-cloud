package com.baker.learning.learnfeign.service;

import com.baker.learning.learnfeign.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description
 * @date 2020/1/14 13:24
 */
@FeignClient(name = "eureka-discovery-client")
@Component
public interface UserServiceFeignClient {


    @RequestMapping("/user")
    public User getById();
}
