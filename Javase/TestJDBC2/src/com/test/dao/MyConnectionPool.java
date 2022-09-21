package com.test.dao;

import com.test.jdbctset1.testLog4j;
import com.test.util.PropertiesUtil;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/18 9:20
 */
public class MyConnectionPool {
    private static String driver;
    private static String url;
    private static String sqlLoginName;
    private static String sqlLoginPassword ;
    private static int initSize; //初始化容量
    private static int maxSize;  //最大容量
    private static Logger logger ;

    private static LinkedList<Connection> pool;

    //加载驱动
    static {
        logger=Logger.getLogger(MyConnectionPool.class);
        //初始化参数
        PropertiesUtil propertiesUtil = new PropertiesUtil("/jdbc.properties");//要注意包名位置
        driver=propertiesUtil.getProperties("driver");
        url=propertiesUtil.getProperties("url");
        sqlLoginName=propertiesUtil.getProperties("sqlLoginName");
        sqlLoginPassword=propertiesUtil.getProperties("sqlLoginPassword");
        initSize=Integer.parseInt(propertiesUtil.getProperties("initSize"));
        maxSize=Integer.parseInt(propertiesUtil.getProperties("maxSize"));
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            logger.fatal("找不到数据库驱动类",e);
        }
        pool = new LinkedList<Connection>();
        for (int i = 0; i < initSize; i++) {
            Connection connection = initConnection();
            if (null != connection) {
                pool.add(connection);
                System.out.println("初始化链接" + connection.hashCode() + "放入链接池");
            }
        }
    }

    //私有的初始化一个连接对象的方法
    private static Connection initConnection() {
        try {
            return DriverManager.getConnection(url, sqlLoginName, sqlLoginPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //共有的向外界提供连接对象的方法
    public static Connection getConnection() {
        Connection connection = null;
        if (pool.size() > 0) {
            connection = pool.removeFirst();
            System.out.println("连接池中还有连接 : " + connection.hashCode());
        } else {
            connection = initConnection();
            System.out.println("连接池空,创建新连接 : " + connection.hashCode());
        }
        return connection;
    }

    //共有的外界归还链接对象的方法
    public static void returnConnection(Connection connection) {
        if (null != connection) {
            try {
                if (connection.isClosed()) {
                    if (pool.size() < maxSize) {
                        try {
                            connection.setAutoCommit(true);
                            System.out.println("设置连接 : " + connection.hashCode() + "自动提交为true");
                        } catch (SQLException e) {
                            throw new RuntimeException(e);
                        }
                        pool.addLast(connection);
                        System.out.println("连接池未满了,归还连接 :" + connection.hashCode());
                    } else {
                        try {
                            connection.close();
                            System.out.println("连接池已经满了,关闭连接 :" + connection.hashCode());
                        } catch (SQLException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } else {
                    System.out.println("连接 :" + connection.hashCode() + "已经归还");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
