package com.hwua.springboot05;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot05ApplicationTests {

    @Autowired
    private DataSource dataSource;
    /*@Autowired
    private JdbcTemplate jdbcTemplate;*/

    @Test
    public void contextLoads() throws SQLException {
        /*String sql = "SELECT * FROM brand";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        System.out.println(JSON.toJSONString(list));*/
        Connection connection = dataSource.getConnection();
        System.out.println(connection.getClass());
        connection.close();
    }

}
