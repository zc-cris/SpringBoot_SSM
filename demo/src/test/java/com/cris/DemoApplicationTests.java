package com.cris;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        // class org.apache.tomcat.jdbc.pool.DataSource
        System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();
        // ProxyConnection[PooledConnection[com.mysql.jdbc.JDBC4Connection@474c9131]]
        System.out.println(connection);
        connection.close();

    }

}
