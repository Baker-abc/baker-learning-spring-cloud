package com.baker.learning.learnhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class LearnHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnHystrixDashboardApplication.class, args);
    }

}
