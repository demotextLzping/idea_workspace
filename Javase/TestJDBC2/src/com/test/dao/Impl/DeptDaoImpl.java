package com.test.dao.Impl;

import com.test.dao.BaseDao;
import com.test.dao.DeptDao;
import com.test.pojo.Dept;
import com.test.pojo.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/12 12:52
 */
public class DeptDaoImpl extends BaseDao implements DeptDao {
    private static String driver="com.mysql.cj.jdbc.Driver";
    private static String url="jdbc:mysql://127.0.0.1:3306/mytestdb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&&serverTimezone=Asia/Shanghai&useServerPrepStmts=true&cachePrepStmts=true";
    private static String sqlLoginName="root";
    private static String sqlLoginPassword="123456";
    @Override
    public List<Dept> showAll() {
        String sql ="select * from dept";
        return baseQuery(Dept.class,sql);
    }
    public int addDept(Dept dept) {
        String sql ="insert into dept values(?,?,?)";
        return baseUpdate(sql,dept.getDeptno(),dept.getDname(),dept.getLoc());
    }
}
