package com.hwua.springboot05;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//自动扫描数据层接口
@MapperScan("com.hwua.springboot05.dao")
//启动缓存
@EnableCaching
public class SpringBoot05Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot05Application.class, args);
    }
}
