package com.baker.learning.learneurekadiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LearnEurekaDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnEurekaDiscoveryServerApplication.class, args);
    }

}
