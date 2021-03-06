package com.baker.learning.learnribbonhystrix.service;

import com.baker.learning.learnribbonhystrix.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description
 * @date 2020/1/14 13:24
 */
@Service
@Log4j2
public class RibbonHystrixUserService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public User getById() {
        return restTemplate.getForObject("http://eureka-discovery-client/user", User.class);
    }

    public User fallback() {
        log.info("================ fallback ==================");
        User user = new User();
        user.setAge(-1);
        user.setName("error");
        user.setSex("error");
        return user;
    }
}
