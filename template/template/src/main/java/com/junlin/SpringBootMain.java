package com.junlin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.junlin")
@MapperScan("com.junlin.mapper")
public class SpringBootMain {
    public static void main(String args[]){
        try{
            SpringApplication.run(SpringBootMain.class, args);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
