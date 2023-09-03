package com.junlin.mapper;

import com.junlin.model.OrderModel;
import com.junlin.model.RoleModel;
import com.junlin.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
//@Repository
public interface UserMapper {
//    @Select("select * from user")
    List<UserModel> SelectUser();
    UserModel SelectUserById(int id);
    List<RoleModel> SelectRole();
    RoleModel SelectRoleById(int id);

    @Select("select * from `order` where id = #{id}")
    OrderModel SelectOrderById(int id);
    @Select("select * from `order`")
    List<OrderModel> SelectOrder();
    void DeleteUser();
    void InsertUser(UserModel userModel);
    int UpdateUser(int password);
}
