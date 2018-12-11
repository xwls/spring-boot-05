package com.hwua.springboot05.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/hello")
    @ResponseBody
    public Object hello(){
        String sql = "SELECT * FROM brand";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }
}
