package com.test.dao;

import com.test.pojo.Emp;

import java.util.List;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/12 12:51
 */
public interface EmpDao {
    /**向emp表添加数据
     * @param emp 传入emp对象，添加该对象
     * @return 添加成功放回非0值，否者返回0
     */
    int addEmp(Emp emp);

    /**通过指定的员工编号删除员工数据
     * @param empno 传入emp对象，删除该对象
     * @return 删除成功放回非0值，否者返回0
     */
    int deleteByEmpno(int empno);

    /**
     * 查看全部员工信息
     * @return 返回一个泛型为Emp的集合
     */
    List<Emp> showAll();

    /**
     * 更具员工编号修改其他的信息
     * @param emp 传入emp对象
     * @return 返回影响数据库的行数
     */
    int updateEmp(Emp emp);


}
