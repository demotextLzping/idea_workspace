package com.lzp.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author： LZPing
 * @date： 2022-11-23 14:38
 * @Description
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp  implements Serializable {
    private Integer empno;
    private String ename;
    private String job;
    private String mgr;
    private Date hiredate;
    private double sal;
    private double comm;
    private Integer deptno;
}
