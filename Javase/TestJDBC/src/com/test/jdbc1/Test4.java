package com.test.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/8/11 9:10
 */
public class Test4 {
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
            //删除操作
//            String sql="delete from dept where deptno=60";
            //修改操作
            String sql="update dept set dname='财务部',loc='shanghai' where deptno=50";
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
