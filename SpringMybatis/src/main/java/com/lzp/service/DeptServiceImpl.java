package com.lzp.service;

import com.lzp.mapper.DeptMapper;
import com.lzp.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    public DeptMapper getDeptMapper() {
        return deptMapper;
    }

    public void setDeptMapper(DeptMapper deptMapper) {
        this.deptMapper = deptMapper;
    }

    @Override
    public int insertDept(Dept dept) {
        return deptMapper.insertDept(dept);
    }

    @Override
    public int deleteDept(Integer deptno) {
        return deptMapper.deleteDept(deptno);
    }

    @Override
    public List<Dept> selectAll() {
        return deptMapper.selectAll();
    }
}
