## 说明
* learn-eureka-discovery-server、learn-eureka-discovery-server-slave：注册中心。两个项目除了ha.yml不一样其他都一样。
* learn-eureka-discovery-client、learn-eureka-discovery-client-slave：服务提供。一模一样，主要为了模拟多个实例


## 如何启动

#### 单机
* learn-eureka-discovery-server：single.yml启动  http://localhost:5001/eureka
* learn-eureka-discovery-client：single.yml启动  http://localhost:5002/eureka
       
#### 高可用（ribbon和或者feign选一种即可）
* learn-eureka-discovery-server：ha.yml启动  http://localhost:5001/eureka
* learn-eureka-discovery-server-slave：ha.yml启动  http://localhost:5002/eureka
* learn-eureka-discovery-client：ha.yml启动
* learn-eureka-discovery-client-slave：ha.yml启动
* learn-ribbon：ha.yml启动                        
* learn-ribbon-hystrix：ha.yml启动              
* learn-hystrix-dashboard：ha.yml启动：http://localhost:5009/hystrix

## 模块

| 模块                                 | 说明                  | application:port                                                 |
| ----------------------------------- | --------------------- | ----------------------------------------|
| learn-eureka-discovery-server       | 注册中心（master）     | eureka-discovery-server:5001  |
| learn-eureka-discovery-server-slave | 注册中心（slave）      | eureka-discovery-server:5002  |
| learn-eureka-discovery-client       | user-client（master） | eureka-discovery-client:5003  |
| learn-eureka-discovery-client-slave | user-client（slave）  | eureka-discovery-client:5004  |
| learn-ribbon                        | ribbon负载均衡         | ribbon-client:5005            |
| learn-ribbon-hystrix                | ribbon负载均衡+熔断    | ribbon-hystrix-client:5007    |
| learn-feign                         | feign负载均衡          | feign-client:5006             |
| learn-feign-hystrix                 | feign负载均衡+熔断     | feign-hystrix-client:5008     |
| learn-hystrix-dashboard             | 服务监控               | hystrix-dashboard:5009        |


## 一些注意事项和说明
* eureka-client：依赖web！
* spring cloud   spring boot 版本有严格对应，新建项目建议在start.spring.io

