package com.test.jdbc2;

import com.test.entity.Account;

import java.sql.*;
import java.util.Scanner;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/8/11 11:22
 */
public class TestInjection2 {
    private static String driver="com.mysql.cj.jdbc.Driver";
    //开启预编译
    private static String url="jdbc:mysql://127.0.0.1:3306/mytestdb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&&serverTimezone=Asia/Shanghai&useServerPrepStmts=true&cachePrepStmts=true";
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
        PreparedStatement preparedStatement = null;
        ResultSet resultSet=null;
        Account account = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, sqlLoginName, sqlLoginPassword);
            /*
            1.使用PrepareStatement语句防止注入攻击
            2.使用？作为参数的占位符，即使是日期和字符串类型的都不需要在添加‘’
            3.connection.createStatement(sql)得到的是普通的Statement对象
            4.connection.prepareStatement(sql)得到的是逾百年一语句PrepareStatement
            5.如果sql语句中有？作为参数的占位符，那么要在执行curd前设置参数
            6.通过set(问好的位置编号，数据) 方法来设置参数
             */
            String sql ="select * from account2 where username=? and password=?";
            preparedStatement = connection.prepareStatement(sql);
            //设置参数
            preparedStatement.setString(1,searchUsername);
            preparedStatement.setString(2,searchPassword);
            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                int aid=resultSet.getInt("aid");
                String username =resultSet.getString("username");
                String password= resultSet.getString("password");
                double money=resultSet.getDouble("money");
                account=new Account(aid,username,password,money);
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
            if (null != preparedStatement) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (null != connection) {
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
