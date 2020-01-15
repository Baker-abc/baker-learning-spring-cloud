package com.baker.learning.learneurekadiscoveryclientslave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LearnEurekaDiscoveryClientSlaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnEurekaDiscoveryClientSlaveApplication.class, args);
    }

}
