package com.junlin.model;

import lombok.Data;

import java.util.List;

@Data
public class UserModel {
    private int id;
    private String username;
    private int password;
    private List<OrderModel> orderList;
}
