package com.hwua.springboot05.service.impl;

import com.hwua.springboot05.dao.BookMapper;
import com.hwua.springboot05.po.Book;
import com.hwua.springboot05.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {

    private Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAll() {
        return bookMapper.queryAll();
    }

    @Override
    @Cacheable(cacheNames = "book",key = "#id",condition = "#id < 10")
    public Book getBook(Integer id) {
        logger.debug("查询"+id+"号图书");
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
