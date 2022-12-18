package com.lzp.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzp.mapper.EmpMapper;
import com.lzp.pojo.Emp;
import com.lzp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-23 14:44
 * @Description
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> findAll() {
        return empMapper.findAll();
    }

    @Override
    public List<Emp> findByPage(Integer pageNum, Integer pageSize) {
        Page<Emp> page = PageHelper.startPage(pageNum, pageSize);
        List<Emp> pageList = empMapper.findAll();
        //获取 页码 页大小 当前页数据 总页数 总记录数
        //方式一  临时数据
        System.out.println("当前页: " + page + page.getPageNum());
        System.out.println("总页数 :" + page.getPages());
        System.out.println("页大小 :" + page.getPageSize());
        System.out.println("总记录数 :" + page.getTotal());
        System.out.println("当前页数据 :" + page.getResult());

        //方式二 pageInfo--》pageBean  正式存储的对象
        PageInfo<Emp> pi = new PageInfo<>(pageList);
        System.out.println();
        System.out.println("当前页: " + pi + page.getPageNum());
        System.out.println("总页数 :" + pi.getPages());
        System.out.println("页大小 :" + pi.getPageSize());
        System.out.println("总记录数 :" + pi.getTotal());
        System.out.println("当前页数据 :" + pi.getList());

        return pageList;
    }


}
