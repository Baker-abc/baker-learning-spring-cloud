package com.baker.learning.learnfeignhystrix.controller;

import com.baker.learning.learnfeignhystrix.service.UserServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @date 2020/1/14 13:16
 */
@RestController
public class UserController {

    @Autowired
    UserServiceFeignClient userServiceFeignClient;

    @GetMapping("/feign-hystrix/user")
    public Object getById() {
        return userServiceFeignClient.getById();
    }

    @GetMapping("/feign-hystrix/user/exception")
    public Object getException() {
        return userServiceFeignClient.getException();
    }
}
