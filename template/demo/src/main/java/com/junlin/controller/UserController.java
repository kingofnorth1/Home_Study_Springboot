package com.junlin.controller;

import com.junlin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class UserController {
//    @Qualifier("user_service")
    @Autowired
    private UserService userService;

    @GetMapping("getUser")
    public Object viewuser(){
        System.out.println("输出成功");
        return userService.SelectUser();
    }
}
