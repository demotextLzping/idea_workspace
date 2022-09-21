package com.test.jdbc2;

import com.test.entity.Account;
import com.test.entity.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/8/11 10:42
 */
public class TestInjection {
    private static String driver="com.mysql.cj.jdbc.Driver";
    private static String url="jdbc:mysql://127.0.0.1:3306/mytestdb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&&serverTimezone=Asia/Shanghai";
    private static String sqlLoginName="root";
    private static String sqlLoginPassword="123456";
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入用户名");
        String scUsername= scanner.next();
        System.out.print("请输入密码");
        String scPassword= scanner.next();
        Account account = getAccount(scUsername, scPassword);
        System.out.println((null != account ? "登录成功" : "登陆失败"));
    }

    public static Account getAccount(String searchUsername, String searchPassword){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet=null;
        Account account = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, sqlLoginName, sqlLoginPassword);
            statement = connection.createStatement();
            //查询操作
            String sql ="select * from account2 where username='"+searchUsername+"' and password='"+searchPassword+"'";
            //结果集
            System.out.println("sql注入时的sql语句 : "+sql);
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                int aid=resultSet.getInt("aid");
                String username =resultSet.getString("username");
                String password= resultSet.getString("password");
                double money=resultSet.getDouble("money");
                account=new Account(aid,username,password,money);
                System.out.println("sql注入时的查询结果 : "+account);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (null != resultSet) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (null != statement) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (null != statement) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return account;
    }
}
