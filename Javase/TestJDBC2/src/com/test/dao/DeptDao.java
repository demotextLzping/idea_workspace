package com.test.dao;


import com.test.pojo.Dept;

import java.util.List;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/12 12:51
 */
public interface DeptDao {
    /**
     * 查看全部部门信息
     * @return 返回一个泛型为deptno的集合
     */
    List<Dept> showAll();

    /**向emp表添加数据
     * @param dept 传入emp对象，添加该对象
     * @return 添加成功放回非0值，否者返回0
     */
    int addDept(Dept dept);


}
