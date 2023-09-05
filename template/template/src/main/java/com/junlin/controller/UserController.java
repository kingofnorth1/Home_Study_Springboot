package com.junlin.controller;

import com.junlin.model.OrderModel;
import com.junlin.model.RoleModel;
import com.junlin.model.UserModel;
import com.junlin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("User")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("GetUser")
    public List<UserModel> SelectUser(){
        System.out.printf("输出正确");
        return userService.SelectUser();
    }

    @GetMapping("GetUser/{id}")
    public UserModel SelectUserById(@RequestParam(defaultValue = "1")int id){
        UserModel userModel = userService.SelectUserById(id);
//        System.out.printf(" "+userModel);
        return userModel;
    }

    @GetMapping("GetOrder")
    public List<OrderModel> SelectOrder(){
        List<OrderModel> orderModel = userService.SelectOrder();
        return orderModel;
    }

    @GetMapping("GetOrder/{id}")
    public OrderModel SelectOrderById(@RequestParam(defaultValue = "1")int id){
        OrderModel orderModel = userService.SelectOrderById(id);
        return orderModel;
    }

    @GetMapping("GetRole")
    public List<RoleModel> SelectRole(){
        List<RoleModel> roleModels = userService.SelectRole();
        return roleModels;
    }

    @GetMapping("GetRole/{id}")
    public RoleModel SelectRoleById(@RequestParam(defaultValue = "1")int id){
        RoleModel roleModel = userService.SelectRoleById(id);
        return roleModel;
    }



}
