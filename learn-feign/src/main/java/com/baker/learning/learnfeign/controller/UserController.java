package com.baker.learning.learnfeign.controller;

import com.baker.learning.learnfeign.service.UserServiceFeignClient;
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

    @GetMapping("/feign/user")
    public Object getById() {
        return userServiceFeignClient.getById();
    }
}
