package com.baker.learning.learnribbonhystrix.controller;

import com.baker.learning.learnribbonhystrix.service.RibbonHystrixUserService;
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
    RibbonHystrixUserService ribbonHystrixUserService;

    @GetMapping("/ribbon-hystrix/user")
    public Object getById() {
        return ribbonHystrixUserService.getById();
    }
}
