package com.testio.io4;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 10:13
 * 标准的输入流
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //得到的是标准的输入流   --》从键盘输入
//        InputStream is=System.in;
        //调用方法
//        int n=is.read();   //read等待键盘的录入 ，所以这是一阻塞方法
//        System.out.println(n);

//        Scanner sc=new Scanner(System.in);
        //System理解为一个管，将这个管怼到键盘上去，如果冲键盘录入的话，就从这个管带程序中了
//        int n=sc.nextInt();
        //Scanner的作用：扫描器，起扫描作用，扫键盘的从这个管出来的数据
//        System.out.println(n);

        //Scanner不止可以扫Syatem.in进来的东西，还能扫描其他的内容
        Scanner sc=new Scanner(new FileInputStream(new File("d:/demo.txt")));
        while(sc.hasNext()){
            System.out.println(sc.next());
        }

    }
}
