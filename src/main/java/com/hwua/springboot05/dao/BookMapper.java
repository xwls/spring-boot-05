package com.hwua.springboot05.dao;


import java.util.List;
import java.util.Map;

public interface BookMapper {
    List<Map<String,Object>> queryAll();
    Map<String,Object> queryById(Integer id);
}
