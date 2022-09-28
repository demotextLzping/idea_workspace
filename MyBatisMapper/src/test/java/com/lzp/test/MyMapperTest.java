package com.lzp.test;

import com.lzp.mapper.DeptMapper;
import com.lzp.pojo.Dept;
import com.sun.corba.se.spi.orb.ParserImplBase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyMapperTest {
    private SqlSessionFactory factory;

    @Before
    public void init() throws IOException {
        InputStream stream = Resources.getResourceAsStream("sqlMapperConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(stream);
    }
    @Test
    public void selectAllDept() throws Exception {
        SqlSession session = factory.openSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        List<Dept> depts = mapper.selectAllDept();
        for (Dept dept : depts) {
            System.out.println(dept.getDeptno() + " " + dept.getDname() + " " + dept.getLoc());
        }
    }
}
