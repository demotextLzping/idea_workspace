package com.lzp.test;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.lzp.bean.Emp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test7 {
    @Test
    public void  test() throws SQLException {
        ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext8.xml");
        DruidDataSource dataSource = appCon.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
        DruidPooledConnection connection = dataSource.getConnection();
    }
}
