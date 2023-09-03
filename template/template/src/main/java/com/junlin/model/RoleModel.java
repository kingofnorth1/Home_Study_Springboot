package com.junlin.model;

import lombok.Data;

import java.util.List;

@Data
public class RoleModel {
    private int rId;
    private String roleName;
    List<UserModel> userList;
}
