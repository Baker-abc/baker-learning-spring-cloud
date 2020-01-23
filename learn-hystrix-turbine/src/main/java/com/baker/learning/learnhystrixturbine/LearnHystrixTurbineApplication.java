package com.baker.learning.learnhystrixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class LearnHystrixTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnHystrixTurbineApplication.class, args);
    }

}
