package com.lzp.dao.impl;

import com.lzp.dao.EmpDao;
import com.lzp.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpDaoImpl implements EmpDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int findEmpCount() {
//        查询员工个数
        String sql = "select count(1) from emp";
//        参数: 1sql语句 2返回时类型的字节码
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Emp findEmpById(int empno) {
//        查询单个员工信息
        String sql = "select * from emp where empno=?";
        BeanPropertyRowMapper<Emp> empBeanPropertyRowMapper = new BeanPropertyRowMapper<>(Emp.class);
//        参数 1sql语句 2RowMapper接口的实现类对象，用于指定结果集的类型 3sql语句需要闯入的参数
        return jdbcTemplate.queryForObject(sql, empBeanPropertyRowMapper, empno);
    }

    @Override
    public List<Emp> findByDeptno(int deptno) {
//        查询一个部门的全部员工信息
//        参数 1 sql语句 2RowMapper接口的实现类对象，用于指定结果集的类型 3sql语句需要闯入的参数
        String sql = "select * from emp where deptno=?";
        BeanPropertyRowMapper<Emp> empBeanPropertyRowMapper = new BeanPropertyRowMapper<>(Emp.class);
        return jdbcTemplate.query(sql, empBeanPropertyRowMapper, deptno);
    }
}
