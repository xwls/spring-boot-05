package com.hwua.springboot05.service.impl;

import com.hwua.springboot05.dao.BookMapper;
import com.hwua.springboot05.po.Book;
import com.hwua.springboot05.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAll() {
        return bookMapper.queryAll();
    }

    @Override
    public Book getBook(Integer id) {
        return bookMapper.queryById(id);
    }

    @Override
    public Book save(Book book) {
        bookMapper.doInsert(book);
        return book;
    }

    @Override
    public Book update(Book book) {
        bookMapper.doUpdate(book);
        return book;
    }

    @Override
    public int delete(Integer id) {
        return bookMapper.doDelete(id);
    }
}
