package com.test.jdbc5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/8/12 11:00
 * 控制事务
 */
public class TestTransaction {
    private static String driver="com.mysql.cj.jdbc.Driver";
    private static String url="jdbc:mysql://127.0.0.1:3306/mytestdb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&&serverTimezone=Asia/Shanghai&useServerPrepStmts=true&cachePrepStmts=true";
    private static String sqlLoginName="root";
    private static String sqlLoginPassword="123456";

    public static void main(String[] args) {
        addTransaction();
    }
    public static void addTransaction() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //默认设置为true自动提交，设置为false时是手动提交
            connection.setAutoCommit(false);
            Class.forName(driver);
            connection = DriverManager.getConnection(url, sqlLoginName, sqlLoginPassword);
            String sql = "update account set balance=balance+ ? where id= ?";
            preparedStatement = connection.prepareStatement(sql);
            //转入
            preparedStatement.setDouble(1,100);
            preparedStatement.setInt(2, 1);
            preparedStatement.executeUpdate();

            int i=2/0;
            //转出
            preparedStatement.setDouble(1,-100);
            preparedStatement.setInt(2, 2);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            //设置回滚点
            if(null!=connection){
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            e.printStackTrace();
        } finally {
            //设置手动提交
            if(null!=connection){
                try {
                   connection.commit();
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
    }
}
