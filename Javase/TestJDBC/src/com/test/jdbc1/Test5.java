package com.test.jdbc1;

import com.test.entity.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/8/11 9:40
 */
/*
实体类：
和数据库表格的名称和字段是一一对应的类
该类的对象主要用处是存储从数据库中查询出来的数据
除此之外，该类没有任何的其他功能
要求：
1.类名与表名保持一致
2.属性个数个数据库表的列数保持一致
3.属性的数据类型和列的数据类型保持一致
4.属性名和数据库表格的列名保持一致
5.所有的属性必须是私有的，为了安全性考虑
6.实体类的属性推荐写成包装类
7.日期推荐写成java.util.Date
8.所有的属性都要有get和set方法
9.必须具备空参构造器
10.实体类必须实现序列化接口
11.实体类中构造方法可选
 */
public class Test5 {
    private static String driver="com.mysql.cj.jdbc.Driver";
    private static String url="jdbc:mysql://127.0.0.1:3306/mytestdb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&&serverTimezone=Asia/Shanghai";
    private static String name="root";
    private static String pwd="123456";
    public static void main(String[] args) {
        List<Emp> emps = testQuery();
        for (Emp emp:emps) {
            System.out.println(emp);
        }
    }
    public static List<Emp> testQuery(){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet=null;
        List list=null;
        try {
            list= new ArrayList<Emp>();
            Class.forName(driver);
            connection = DriverManager.getConnection(url, name, pwd);
            statement = connection.createStatement();
            //查询操作
            String sql ="select * from emp";
            //结果集
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                //可使用位置编号来的得到数据
//                int empno=resultSet.getInt(1);
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
        return list;
    }
}
