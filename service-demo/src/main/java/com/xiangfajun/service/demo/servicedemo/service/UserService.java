package com.xiangfajun.service.demo.servicedemo.service;

import com.xiangfajun.service.demo.servicedemo.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    public User getOne(Long id){
        User user = new User();
        user.setAge(10);
        user.setId(id);
        user.setUsername("张三" + id);
        return user;
    }

}
