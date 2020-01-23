package com.baker.learning.learngatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class LearnGatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnGatewayZuulApplication.class, args);
    }

}
