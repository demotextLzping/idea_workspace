package com.test.jdbc3;

import com.test.entity.Emp;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/8/11 14:11
 * 增删查改功能实现
 */
public class TestPreparedStatement {
    private static String driver="com.mysql.cj.jdbc.Driver";
    private static String url="jdbc:mysql://127.0.0.1:3306/mytestdb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&&serverTimezone=Asia/Shanghai&useServerPrepStmts=true&cachePrepStmts=true";
    private static String sqlLoginName="root";
    private static String sqlLoginPassword="123456";
    public static void main(String[] args) {
//        testAdd();
//        testUpdate();
//        testDelete();
        testQuery();
    }
    public static void testAdd(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, sqlLoginName, sqlLoginPassword);
            String sql ="insert into emp values(null,?,?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            //设置参数
            preparedStatement.setString(1,"mark");
            preparedStatement.setString(2,"clerk");
            preparedStatement.setInt(3,7839);
            preparedStatement.setDate(4,new Date(System.currentTimeMillis()));
            preparedStatement.setDouble(5,1000);
            preparedStatement.setDouble(6,100);
            preparedStatement.setInt(7,30);
            int row = preparedStatement.executeUpdate();
            System.out.println(row);

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
    public static void testUpdate(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, sqlLoginName, sqlLoginPassword);
            String sql ="update  emp set ename=?,deptno=? where empno=?";
            preparedStatement = connection.prepareStatement(sql);
            //设置参数
            preparedStatement.setString(1,"olive");
            preparedStatement.setString(2,"20");
            preparedStatement.setInt(3,7935);
            int row = preparedStatement.executeUpdate();
            System.out.println(row);

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
    public static void testDelete(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, sqlLoginName, sqlLoginPassword);
            String sql ="delete from emp where empno=?";
            preparedStatement = connection.prepareStatement(sql);
            //设置参数
            preparedStatement.setInt(1,7935);
            int row = preparedStatement.executeUpdate();
            System.out.println(row);

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
    public static void testQuery(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet=null;
        List <Emp>list=null;
        try {
            list= new ArrayList<Emp>();
            Class.forName(driver);
            connection = DriverManager.getConnection(url, sqlLoginName, sqlLoginPassword);
            String sql ="select * from emp where ename like ?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,"%A%");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int empno=resultSet.getInt("empno");
                String ename=resultSet.getString("ename");
                String job= resultSet.getString("job");
                int mgr=resultSet.getInt("mgr");
                Date hiredate=resultSet.getDate("hiredate");
                double sal =resultSet.getDouble("sal");
                double comm=resultSet.getDouble("comm");
                int deptno=resultSet.getInt("deptno");
                Emp emp=new Emp(empno,ename,job,mgr,hiredate,sal,comm,deptno);
                list.add(emp);
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
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }
}
