package com.baker.learning.learneurekadiscoveryclientslave.service;

import com.baker.learning.learneurekadiscoveryclientslave.model.User;
import org.springframework.stereotype.Service;

/**
 * @description
 * @date 2020/1/14 13:24
 */
@Service
public class UserService {

    public User getById() {
        User user = new User();
        user.setName("baker");
        user.setAge(28);
        user.setSex("man");
        return user;
    }
}
