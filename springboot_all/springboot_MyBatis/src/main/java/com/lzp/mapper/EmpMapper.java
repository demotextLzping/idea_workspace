package com.lzp.mapper;

import com.lzp.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.LinkedList;
import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-23 14:46
 * @Description
 */
@Mapper
public interface EmpMapper {
    List<Emp> findAll();

    List<Emp> findByPage(Integer pageNum,Integer pageSize);
}
