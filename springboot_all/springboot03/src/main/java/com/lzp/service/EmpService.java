package com.lzp.service;

import com.lzp.pojo.Emp;

import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-23 14:44
 * @Description
 */

public interface EmpService {
    List<Emp> findAll();
    List<Emp> findByPage(Integer pageNum,Integer pageSize);

}
