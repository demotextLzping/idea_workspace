package com.testio.io4;

import java.io.PrintStream;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 10:29
 * System.out
 */
public class Test2 {
    public static void main(String[] args) {
        PrintStream out = System.out;
        out.print("编号1");
        out.print("编号2");
        out.print("编号3");

        out.println("编号11");
        out.println("编号22");
        out.println("编号22");
    }
}
