package com.test.jdbc1;

import java.sql.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.通过反射加载驱动 2.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.获得链接 Connection
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

        //3.获得语句对象 Statement
        Statement statement = connection.createStatement();

        //4.执行sql语句，返回结果
        String sql="insert into dept values(50,'教育部','beijing')";
        //rows代表对数据库数据多少行产生影响
        int rows = statement.executeUpdate(sql);
        System.out.println("影响行数 : "+rows);

        //5.释放资源
        statement.close();
        connection.close();
    }
}

