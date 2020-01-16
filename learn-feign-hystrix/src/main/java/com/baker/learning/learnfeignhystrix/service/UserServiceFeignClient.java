package com.baker.learning.learnfeignhystrix.service;

import com.baker.learning.learnfeignhystrix.model.User;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description
 * @date 2020/1/14 13:24
 */
// 启用  UserServiceFeignHystrixClient
//@FeignClient(name = "eureka-discovery-client", fallback = UserServiceFeignClient.UserServiceFeignHystrixClient.class)
// 启用  UserServiceFeignHystrixThrowableClient
@FeignClient(name = "eureka-discovery-client", fallbackFactory = UserServiceFeignClient.UserServiceFeignHystrixThrowableClient.class)
@Component
public interface UserServiceFeignClient {


    @RequestMapping("/user")
    public User getById();

    @RequestMapping("/user/exception")
    public User getException();

    @Component
    static class UserServiceFeignHystrixClient implements UserServiceFeignClient {

        @Override
        public User getById() {
            User user = new User();
            user.setAge(-1);
            user.setName("error");
            user.setSex("error");
            return user;
        }

        @Override
        public User getException() {
            User user = new User();
            user.setAge(-1);
            user.setName("error");
            user.setSex("error");
            return user;
        }
    }

    @Component
    static class UserServiceFeignHystrixThrowableClient implements FallbackFactory<UserServiceFeignClient> {

        @Override
        public UserServiceFeignClient create(Throwable throwable) {
            return new UserServiceFeignClient() {
                @Override
                public User getById() {
                    User user = new User();
                    user.setAge(-1);
                    user.setName("exception");
                    user.setSex("exception");
                    return user;
                }

                @Override
                public User getException() {
                    User user = new User();
                    user.setAge(-1);
                    user.setName(throwable.getMessage());
                    user.setSex(throwable.getMessage());
                    return user;
                }
            };
        }
    }
}
