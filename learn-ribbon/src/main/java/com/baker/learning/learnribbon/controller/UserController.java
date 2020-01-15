package com.baker.learning.learnribbon.controller;

import com.baker.learning.learnribbon.service.UserService;
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
    UserService userService;

    @GetMapping("/ribbon/user")
    public Object getById() {
        return userService.getById();
    }
}
