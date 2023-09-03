package com.junlin.services;


import com.junlin.model.OrderModel;
import com.junlin.model.RoleModel;
import com.junlin.model.UserModel;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.util.List;

public interface UserService {
    List<UserModel> SelectUser();
//    List<UserModel> SelectOrder();
    UserModel SelectUserById(int id);
    List<OrderModel> SelectOrder();
    OrderModel SelectOrderById(int id);
    List<RoleModel> SelectRole();
    RoleModel SelectRoleById(int id);

}
