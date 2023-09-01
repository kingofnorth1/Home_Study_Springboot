package com.junlin.services.impl;

import com.junlin.mapper.UserMapper;
import com.junlin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//@Component
public class UserServiceimpl implements UserService {
//    @Qualifier("user_mapper")
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<String> SelectUser() {
        return userMapper.SelectUser();
    }
}
