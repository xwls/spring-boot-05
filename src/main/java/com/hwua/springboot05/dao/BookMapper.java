package com.hwua.springboot05.dao;

import com.hwua.springboot05.po.Book;

import java.util.List;

/**
 * 包含的方法：
 *  - 查询全部
 *  - 根据id查询指定的Book
 *  - 添加
 *  - 修改
 *  - 删除
 */
public interface BookMapper {

    /**
     * 查询全部Book
     * @return
     */
    List<Book> queryAll();

    /**
     * 根据id查询Book
     * @param id 编号
     * @return
     */
    Book queryById(Integer id);

    /**
     * 添加
     * @param book
     * @return
     */
    int doInsert(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    int doUpdate(Book book);

    /**
     * 删除
     * @param id 编号
     * @return
     */
    int doDelete(Integer id);
}
