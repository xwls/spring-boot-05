package com.hwua.springboot05;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//自动扫描数据层接口
@MapperScan("com.hwua.springboot05.dao")
public class SpringBoot05Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot05Application.class, args);
    }
}
