package com.junlin.services.Impl;

import com.junlin.mapper.UserMapper;
import com.junlin.model.OrderModel;
import com.junlin.model.RoleModel;
import com.junlin.model.UserModel;
import com.junlin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required=true)
    private UserMapper userMapper;

    @Override
    public List<UserModel> SelectUser() {
        return userMapper.SelectUser();
    }
    @Override
    public UserModel SelectUserById(int id) {
        return userMapper.SelectUserById(id);
    }

    @Override
    public List<OrderModel> SelectOrder(){
        return userMapper.SelectOrder();
    }
    @Override
    public OrderModel SelectOrderById(int id){
        return userMapper.SelectOrderById(id);
    }

    @Override
    public List<RoleModel> SelectRole(){
        return userMapper.SelectRole();
    }
    @Override
    public RoleModel SelectRoleById(int id){
        return userMapper.SelectRoleById(id);
    }
}
