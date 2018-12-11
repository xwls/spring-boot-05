package com.hwua.springboot05.controller;

import com.hwua.springboot05.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @GetMapping("/books")
    public Object books(){
        return bookMapper.queryAll();
    }

    @GetMapping("/book/{id}")
    public Object book(@PathVariable Integer id){
        return bookMapper.queryById(id);
    }
}
