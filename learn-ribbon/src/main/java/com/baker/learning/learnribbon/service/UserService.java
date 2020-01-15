package com.baker.learning.learnribbon.service;

import com.baker.learning.learnribbon.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description
 * @date 2020/1/14 13:24
 */
@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    public User getById() {
        return restTemplate.getForObject("http://eureka-discovery-client/user", User.class);
    }
}
