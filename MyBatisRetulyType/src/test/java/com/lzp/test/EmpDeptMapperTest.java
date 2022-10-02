package com.lzp.test;

import com.lzp.mapper.DeptMapper;
import com.lzp.mapper.EmpDeptMapper;
import com.lzp.mapper.EmpMapper;
import com.lzp.pojo.Dept;
import com.lzp.pojo.Emp;
import com.lzp.pojo.EmpDept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class EmpDeptMapperTest {
    private SqlSessionFactory factory;

    @Before
    public void init() throws IOException {
        InputStream stream = Resources.getResourceAsStream("sqlMapperConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(stream);
    }

    @Test
    public void selectAll() throws Exception {
        SqlSession session = factory.openSession();
        EmpDeptMapper mapper = session.getMapper(EmpDeptMapper.class);
        List<EmpDept> empDepts = mapper.selectAll();
        session.close();
        for (EmpDept ed : empDepts) {
            System.out.println(ed.getEmpno() + " " + ed.getDname() + " " +
                    ed.getJob() + " " + ed.getSal() + ed.getDeptno() + " " + ed.getLoc());
        }
    }

    @Test
    public void selectAllEmp() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Emp> emps = mapper.selectAllEmp();
        session.close();
        for (Emp ed : emps) {
            System.out.println(ed.getEmpno() + " " + ed.getEname() + " " +
                    ed.getJob() + " " + ed.getSal() + ed.getDept().getDeptno() + " " + ed.getDept().getDname() + " " + ed.getDept().getLoc());
        }
    }

    @Test
    public void findDeptById() throws Exception {
        SqlSession session = factory.openSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        Dept dept = mapper.findDeptById(30);
        session.close();
        System.out.println("部门编号: " + dept.getDeptno() + "部门名称: " + dept.getDname() + "部门地址: " + dept.getLoc());
        if (dept.getEmps() != null) {
            for (Emp emp : dept.getEmps()) {
                System.out.println(emp.getEmpno()  + " "+emp.getEname()+" " + emp.getSal());
            }
        }
    }
}
