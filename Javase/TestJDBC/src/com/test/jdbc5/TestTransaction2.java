package com.test.jdbc5;

import java.sql.*;
import java.util.LinkedList;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/8/12 11:37
 */
public class TestTransaction2 {
    private static String driver="com.mysql.cj.jdbc.Driver";
    private static String url="jdbc:mysql://127.0.0.1:3306/mytestdb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&&serverTimezone=Asia/Shanghai&useServerPrepStmts=true&cachePrepStmts=true";
    private static String sqlLoginName="root";
    private static String sqlLoginPassword="123456";

    public static void main(String[] args) {
        addTransaction();
    }
    public static void addTransaction(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        LinkedList<Savepoint> savepoints = new LinkedList<Savepoint>();
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, sqlLoginName, sqlLoginPassword);
            //默认设置为true自动提交，设置为false时是手动提交
            connection.setAutoCommit(false);
            String sql ="insert into dept values(?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            int deptno=50;
            for (int i = 0; i < 10000; i++) {
                preparedStatement.setInt(1, deptno=deptno+1);
                preparedStatement.setString(2,"name");
                preparedStatement.setString(3,"loc");
                preparedStatement.addBatch();//将修改放入一个批次中
                //批处理一次1000条数据
                if(i%1000==0){
                    preparedStatement.executeBatch();
                    preparedStatement.clearBatch();
                    //每1000条数据加入回滚点，利用linkedList保存回滚点
                    Savepoint savepoint = connection.setSavepoint();
                    savepoints.addLast(savepoint);
                }
                //设置异常点
                if(i==5001){
                    int j=1/0;
                }
            }
            //将剩下的数据处理
            preparedStatement.executeBatch();
            preparedStatement.clearBatch();

        } catch (Exception e) {
            //设置回滚点
            if(null!=connection){
                try {
                    Savepoint savepointlast = savepoints.getLast();
//                    if(null!=savepointlast){//若回滚点的长度小于实际语句的长度则判断
                        connection.rollback(savepointlast);
//                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            e.printStackTrace();
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
