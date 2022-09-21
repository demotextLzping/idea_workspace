package com.testio.io3;

import java.io.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/18 14:40
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //创建一个文件对象
        File f = new File("d:/demo.txt");
        //创建一个字节流输入对此昂、
        FileInputStream fis = new FileInputStream(f);
        //创建一个字节流转换为字符流的对象
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        //创建字符数组
        char[] c=new char[10];
        int len=isr.read(c);
        while(len!=-1){
            System.out.println(new String (c,0,len));
            len=isr.read(c);
        }
        //关闭流
        isr.close();


    }

}
