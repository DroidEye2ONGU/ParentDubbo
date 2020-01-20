package droid.user.service.impl;

import org.apache.dubbo.config.annotation.Service;

import droid.user.service.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "Hello";
    }
}
