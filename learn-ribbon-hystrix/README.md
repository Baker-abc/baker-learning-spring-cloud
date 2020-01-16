#### 访问 http://localhost:5007/actuator/hystrix.stream 需要
```
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
```
```
management:
  endpoints:
    web:
      exposure:
        include: hystrix.stream
```
