package com.testio.io1;

import java.io.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/18 9:17]
 * io流文件输入输出    文件 --》程序 --》文件
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        //文件 --》程序
        //1.读取的源文件
        File fi = new File("d:/demo.txt");
        //2.创建一个FileReader对象，指向读取的源文件
        FileReader fr = new FileReader(fi);
        //3.读取源文件的内容
        String s="";
        int n = fr.read();
        while(n!=-1){
             s=s+(char)n;
             n = fr.read();
         }
        System.out.println(s);
        //4.关闭流
        fr.close();

        //程序 --》文件
        //1.读取的源文件
        File fo = new File("d:/test.txt");
        //2.创建一个FileReader对象，指向要写入的的源文件
        FileWriter fw = new FileWriter(fo,true);
        //3.写入件的内容
        s.toCharArray(); //将字符串转换为字符数组写入文件
        fw.write(s);
        //4.关闭流
        fw.close();


    }
}
