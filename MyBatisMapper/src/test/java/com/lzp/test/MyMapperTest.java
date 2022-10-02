package com.lzp.test;

import com.lzp.mapper.DeptMapper;
import com.lzp.mapper.EmpMapper;
import com.lzp.pojo.Dept;
import com.lzp.pojo.Emp;
import com.sun.corba.se.spi.orb.ParserImplBase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

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
        session.close();
        for (Dept dept : depts) {
            System.out.println(dept.getDeptno() + " " + dept.getDname() + " " + dept.getLoc());
        }
    }

    @Test
    public void selectEmpBySaleName() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEname("king");
        emp.setSal(3000.0);
        List<Emp> emps = mapper.selectEmpBySaleName(emp);
        session.close();
        for (Emp e : emps) {
            System.out.println(e.getEname() + " " + e.getSal() + " " + e.getDeptno());
        }
    }

    @Test
    public void LikeSelectEmpBySaleName() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEname("s");
        emp.setSal(1000.0);
        List<Emp> emps = mapper.LikeSelectEmpBySaleName(emp);
        session.close();
        for (Emp e : emps) {
            System.out.println(e.getEname() + "  " + e.getSal() + "  " + e.getDeptno());
        }
    }

    @Test
    public void LikeSelectEmpBySaleName2() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEname("s");
        emp.setSal(1000.0);
        emp.setDeptno(20);
        List<Emp> emps = mapper.LikeSelectEmpBySaleName2(emp);
        session.close();
        for (Emp e : emps) {
            System.out.println(e.getEname() + "  " + e.getSal() + "  " + e.getDeptno());
        }
    }

    @Test
    public void LikeSelectEmpBySaleName3() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEname("s");
        emp.setSal(1000.0);
        emp.setDeptno(20);
        List<Emp> emps = mapper.LikeSelectEmpBySaleName3(emp);
        session.close();
        for (Emp e : emps) {
            System.out.println(e.getEname() + "  " + e.getSal() + "  " + e.getDeptno());
        }
    }

    @Test
    public void LikeSelectEmpBySaleName4() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEname("s");
        emp.setSal(3000.0);
        emp.setDeptno(20);
        List<Emp> emps = mapper.LikeSelectEmpBySaleName4(emp);
        session.close();
        for (Emp e : emps) {
            System.out.println(e.getEname() + "  " + e.getSal() + "  " + e.getDeptno());
        }
    }

    @Test
    public void LikeSelectEmpByInfo() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEname("s");
        emp.setSal(2000.0);
        emp.setDeptno(20);
        List<Emp> emps = mapper.LikeSelectEmpByInfo(emp);
        session.close();
        for (Emp e : emps) {
            System.out.println(e.getEname() + "  " + e.getSal() + "  " + e.getDeptno());
        }
    }

    @Test
    public void LikeSelectEmpByInfo2() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
//        emp.setSal(2000.0) ;
//        emp.setEname("s");
        emp.setDeptno(20);
        List<Emp> emps = mapper.LikeSelectEmpByInfo2(emp);
        session.close();
        for (Emp e : emps) {
            System.out.println(e.getEname() + "  " + e.getSal() + "  " + e.getDeptno());
        }
    }

    @Test
    public void insertEmp() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEname("olive");
        emp.setMgr(7902);
        emp.setSal(2000.0);
        emp.setDeptno(20);
        int emps = mapper.insertEmp(emp);
        session.commit();
        session.close();
        System.out.println(emps == 1 ? " 添加成功" : " 添加失败");
    }

    @Test
    public void updateEmp() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setDeptno(20);
        emp.setEmpno(7940);
        emp.setSal(2000.0);
        emp.setMgr(7902);
        emp.setJob("clerk");
        int emps = mapper.updateEmp(emp);
        session.commit();
        session.close();
        System.out.println(emps == 1 ? " 修改成功" : " 修改失败");
    }

    @Test
    public void selectEmpByForeach() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Integer> list = new ArrayList<Integer>();
        list.add(7369);
        list.add(7499);
        list.add(7521);
        list.add(7566);
        List<Emp> emps = mapper.selectEmpByForeach(list);
        session.close();
        for (Emp e : emps) {
            System.out.println(e.getEmpno() + "  " + e.getEname() + "  " + e.getSal());
        }
    }

    @Test
    public void selectEmpByForeach2() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        int array[]={10,20};
        List<Emp> emps = mapper.selectEmpByForeach2(array);
        session.close();
        for (Emp e : emps) {
            System.out.println(e.getEmpno() + "  " + e.getEname() + "  " + e.getDeptno());
        }
    }

    @Test
    public void selectEmpByForeach3() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        HashMap<String, List<Integer>> stringListHashMap = new HashMap<>();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        stringListHashMap.put("empnos",integers);
        List<Emp> emps = mapper.selectEmpByForeach3(stringListHashMap);
        session.close();
        for (Emp e : emps) {
            System.out.println(e.getEmpno() + "  " + e.getEname() + "  " + e.getDeptno());
        }
    }

    @Test
    public void selectEmpByMapInfo() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("deptnokey",30);
        map.put("enamekey","a");
        List<Integer> list= new ArrayList<>();
        list.add(7369);
        list.add(7654);
        list.add(7698);
        map.put("empnos",list);
        List<Emp> emps = mapper.selectEmpByMapInfo(map);
        session.close();
        for (Emp e : emps) {
            System.out.println(e.getEmpno() + "  " + e.getEname() + "  " + e.getDeptno());
        }
    }
}
