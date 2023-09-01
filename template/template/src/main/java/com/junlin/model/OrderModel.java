package com.junlin.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
public class OrderModel {
    private int Id;
    private int userId;
    private String orderName;
    private String orderType;
}
