package com.baker.learning.learneurekadiscoveryserverslave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LearnEurekaDiscoveryServerSlaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnEurekaDiscoveryServerSlaveApplication.class, args);
    }

}
