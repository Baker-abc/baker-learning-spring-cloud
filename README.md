eureka-client：依赖web！
spring cloud   spring boot 版本有严格对应，新建项目建议在start.spring.io
There are multiple implementations of "Discovery Service" (eureka, consul, zookeeper).
 @EnableDiscoveryClient lives in spring-cloud-commons and picks the 
 implementation on the classpath. @EnableEurekaClient lives in 
 spring-cloud-netflix and only works for eureka. 
 If eureka is on your classpath, they are effectively the same
 
 
* 配置host：127.0.0.1 discovery-server discovery-server2 discovery-client  
* ha 高可用 
* ribbon 负载均衡
* ribbon hystrix 负载均衡 + 熔断
* feign 负载均很
