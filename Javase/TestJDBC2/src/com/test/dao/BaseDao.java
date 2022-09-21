package com.test.dao;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/17 13:06
 */
public class BaseDao {
    public   int baseUpdate(String sql,Object ...args){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int row=0;
        try {
            connection=MyConnectionPool.getConnection();
            preparedStatement=connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i+1,args[i]);
            }
            row = preparedStatement.executeUpdate();

        } catch (  Exception e) {
           e.printStackTrace();
        } finally {

            if (null != preparedStatement) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != connection) {
                try {
                    MyConnectionPool.returnConnection(connection);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return row;
    }

    public List baseQuery(Class clazz,String sql, Object ...args){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet=null;
        List list=null;
        try {
            list= new ArrayList();
            connection=MyConnectionPool.getConnection();
            preparedStatement=connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i+1,args[i]);
            }
            resultSet = preparedStatement.executeQuery();
            Field[] fields = clazz.getDeclaredFields();
            for (Field filed : fields ) {
                filed.setAccessible(true);
            }
            while(resultSet.next()){
//                //通过反射创建对象
                Object obj = clazz.newInstance();
                for (Field field : fields) {
                    String fieldName = field.getName();
                    Object data=resultSet.getObject(fieldName);
                    field.set(obj,data);
                }
                list.add(obj);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (null != resultSet) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != preparedStatement) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != connection) {
                try {
                    MyConnectionPool.returnConnection(connection);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

}
