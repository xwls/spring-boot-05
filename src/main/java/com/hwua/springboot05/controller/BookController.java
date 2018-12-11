package com.hwua.springboot05.controller;

import com.hwua.springboot05.po.Book;
import com.hwua.springboot05.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public Object books(){
        return bookService.getAll();
    }

    @GetMapping("/book/{id}")
    public Object book(@PathVariable Integer id){
        return bookService.getBook(id);
    }

    //地址：/save?name=AA&price=10
    @GetMapping("/save")
    public Object save(Book book){
        return bookService.save(book);
    }

    //地址：/update?id=24&name=BB&price=10
    @GetMapping("/update")
    public Object update(Book book){
        return bookService.update(book);
    }

    //地址：/delete?id=24
    @GetMapping("/delete")
    public String delete(Integer id){
        int delete = bookService.delete(id);
        return delete == 1 ? "成功" : "失败";
    }

}
