package com.hwua.springboot05.service;

import com.hwua.springboot05.po.Book;

import java.util.List;

public interface BookService {

    List<Book> getAll();

    Book getBook(Integer id);

    Book save(Book book);

    Book update(Book book);

    int delete(Integer id);
}
