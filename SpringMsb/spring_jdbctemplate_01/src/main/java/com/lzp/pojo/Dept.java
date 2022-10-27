package com.lzp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.PrinterURI;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Integer deptno;
    private String dname;
    private String loc;
}
