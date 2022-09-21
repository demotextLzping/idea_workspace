package com.test.view;

import com.test.dao.Impl.DeptDaoImpl;
import com.test.dao.Impl.EmpDaoImpl;
import com.test.pojo.Dept;
import com.test.pojo.Emp;


import java.sql.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/17 10:44
 */
public class EmpManageSystem {
    private static final Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        o:while(true){
            showMenu();
            System.out.print("请输入选项编号 : ");
            int option=sc.nextInt();
            switch (option){
                case 1:
                   showEmpAll();
                    break;
                case 2:
                   showDeptAll();
                    break;
                case 3:
                    showEmpAll();
                    EmpDaoImpl emp_delete=new EmpDaoImpl();
                    System.out.print("请输入员工编号 : ");
                    int empno=sc.nextInt();
                    int row=emp_delete.deleteByEmpno(empno);
                    System.out.print(row==1?"删除成功":"删除失败");
                    break;
                case 4:
                    showEmpAll();
                    EmpDaoImpl emp_change=new EmpDaoImpl();
                    System.out.print("请输入要修改的员工的编号 : ");
                    int empno_change= Integer.parseInt(sc.next());
                    System.out.print("请输入员工姓名 : ");
                    String ename_change=sc.next();
                    System.out.print("请输入员工岗位 : ");
                    String job_change=sc.next();
                    System.out.print("请输入员工上级编号 : ");
                    int mgr_change=sc.nextInt();
                    System.out.print("请输入员工入职日期 : ");
                    String hiredate_change=sc.next();
                    System.out.print("请输入员工工资 : ");
                    double sal_change=sc.nextDouble();
                    System.out.print("请输入员工补贴 : ");
                    double comm_change=sc.nextDouble();
                    System.out.print("请输入员工部门编号 : ");
                    int deptno_change=sc.nextInt();
                    Emp emp2=new Emp(empno_change,ename_change,job_change,mgr_change,Date.valueOf(hiredate_change),sal_change,comm_change,deptno_change);
                    int row_change = emp_change.updateEmp(emp2);
                    System.out.println(row_change==1?"修改成功":"修改失败");
                    break;
                case 5:
                    EmpDaoImpl emp_add=new EmpDaoImpl();
                    System.out.print("请输入员工姓名 : ");
                    String ename_add=sc.next();
                    System.out.print("请输入员工岗位 : ");
                    String job_add=sc.next();
                    System.out.print("请输入员工上级编号 : ");
                    int mgr_add=sc.nextInt();
                    System.out.print("请输入员工入职日期 : ");
                    String hiredate_add=sc.next();
                    System.out.print("请输入员工工资 : ");
                    double sal_add=sc.nextDouble();
                    System.out.print("请输入员工补贴 : ");
                    double comm_add=sc.nextDouble();
                    System.out.print("请输入员工部门编号 : ");
                    int deptno_empAdd=sc.nextInt();
                    Emp empAdd=new Emp(null,ename_add,job_add,mgr_add,Date.valueOf(hiredate_add),sal_add,comm_add,deptno_empAdd);
                    int row_empAdd=emp_add.addEmp(empAdd);
                    System.out.println("\n"+(row_empAdd==1?"添加成功":"添加失败"));
                    break;
                case 6:
                    DeptDaoImpl dept_add=new DeptDaoImpl();
                    System.out.print("请输入部门编号 : ");
                    int deptno_deptAdd=sc.nextInt();
                    System.out.print("请输入部门名称 : ");
                    String dname_deptAdd=sc.next();
                    System.out.print("请输入办公地点 : ");
                    String loc_deptAdd=sc.next();
                    Dept dept1=new Dept(deptno_deptAdd,dname_deptAdd,loc_deptAdd);
                    int row_deptAdd=dept_add.addDept(dept1);
                    System.out.println("\n"+(row_deptAdd==1?"添加成功":"添加失败"));
                    break;
                case 7:
                   break o;
                default:
                    System.out.println("请输入正确的选项编号！");
            }
            System.out.println();
        }
    }
    public static  void showMenu(){
        System.out.println("******************************");
        System.out.println("1 查看所有员工信息");
        System.out.println("2 查看所有部门信息");
        System.out.println("3 根据工号删除员工信息");
        System.out.println("4 根据工号修改员工信息");
        System.out.println("5 增加员工信息");
        System.out.println("6 增加部门信息");
        System.out.println("7 退出系统");
        System.out.println("*****************************");
    }

    public static void showEmpAll() {
        EmpDaoImpl emp=new EmpDaoImpl();
        List<Emp> emp_list=emp.showAll();
        emp_list.forEach(System.out::println);
    }
    public static void showDeptAll() {
        DeptDaoImpl dept=new DeptDaoImpl();
        List<Dept> dept_list=dept.showAll();
        dept_list.forEach(System.out::println);
    }
}
