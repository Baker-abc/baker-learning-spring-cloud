package com.baker.learning.learneurekadiscoveryclient.controller;

import com.baker.learning.learneurekadiscoveryclient.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @date 2020/1/14 13:16
 */
@RestController
@Log4j2
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public Object getById() {
        log.info("/user");
        return userService.getById();
    }
}
