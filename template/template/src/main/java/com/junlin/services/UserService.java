package com.junlin.services;


import com.junlin.model.OrderModel;
import com.junlin.model.UserModel;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.util.List;

public interface UserService {
    List<UserModel> SelectUser();
    UserModel SelectUserById(int id);
    OrderModel SelectOrderById(int id);
    List<OrderModel> SelectOrder();

}
