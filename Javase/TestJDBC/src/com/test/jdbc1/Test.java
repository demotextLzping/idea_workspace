package com.test.jdbc1;

import java.sql.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/8/10 13:56
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        //1.加载驱动
        Driver driver=new com.mysql.cj.jdbc.Driver();

        //2.注册驱动DriverManager 静态方法
        DriverManager.registerDriver(driver);

        //3.获得链接 Connection
        /*
        user : 用户名
        password: 密码
        url : 统一资源定位符
            1.协议 jdbc:mysql
            2.ip  127.0.0.1/localhost
            3.端口号 2206
            4.数据库名字 mytestdb
            5.参数
            协议://ip：端口/资源路径？参数名=参数值&参数名=参数值....
            jdbc:mysql://127.0.0.1:3306/mytestdb
         */
        String url="jdbc:mysql://127.0.0.1:3306/mytestdb?";
        String purl="useSSL=false&useUnicode=true&characterEncoding=UTF-8&&serverTimezone=Asia/Shanghai";
        String name="root";
        String pwd="123456";
        Connection connection = DriverManager.getConnection(url+purl, name, pwd);

        //4.获得语句对象 Statement
        Statement statement = connection.createStatement();

        //5.执行sql语句，返回结果
        String sql="insert into dept values(50,'教育部','beijing')";
        //rows代表对数据库数据多少行产生影响
        int rows = statement.executeUpdate(sql);
        System.out.println("影响行数 : "+rows);

        //6.释放资源
        statement.close();
        connection.close();
    }
}
