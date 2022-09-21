package com.test.jdbc1;

import java.lang.reflect.Constructor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/8/10 14:52
 */
public class Test3 {
    private static String driver="com.mysql.cj.jdbc.Driver";
    private static String url="jdbc:mysql://127.0.0.1:3306/mytestdb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&&serverTimezone=Asia/Shanghai";
    private static String name="root";
    private static String pwd="123456";
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, name, pwd);
            statement = connection.createStatement();
            String sql="insert into dept values(60,'教育部','beijing')";
            int rows = statement.executeUpdate(sql);
            System.out.println("影响行数 : "+rows);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(null!=statement){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(null!=statement){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
