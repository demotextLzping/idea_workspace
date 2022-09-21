package com.test.jdbc4;

import java.sql.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/8/12 10:23
 */
public class TestBatch {
    private static String driver="com.mysql.cj.jdbc.Driver";
    private static String url="jdbc:mysql://127.0.0.1:3306/mytestdb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&&serverTimezone=Asia/Shanghai&useServerPrepStmts=true&cachePrepStmts=true";
    private static String sqlLoginName="root";
    private static String sqlLoginPassword="123456";

    public static void main(String[] args) {
        addBatch();
    }
    public static void addBatch(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int rows=0;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, sqlLoginName, sqlLoginPassword);
            String sql ="insert into dept values(?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            int deptno=50;
            for (int i = 0; i < 1000; i++) {
                preparedStatement.setInt(1, deptno=deptno+10);
                preparedStatement.setString(2,"name");
                preparedStatement.setString(3,"loc");
                preparedStatement.addBatch();//将修改放入一个批次中
            }
            int[] ints = preparedStatement.executeBatch();
            for (int anInt : ints) {
               rows+=anInt;
            }
            System.out.println(rows);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {

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
