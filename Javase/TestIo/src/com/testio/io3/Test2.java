package com.testio.io3;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/18 15:01
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        //创建一个读取文件对象
        File fi = new File("d:/demo.txt");
        //创建一个写入文件对象
        File fo = new File("d:/test.txt");

        //创建一个字节输入流，读取文件
        FileInputStream fis = new FileInputStream(fi);
        //创建一个转换流（字节转换为字符流）
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

        //创建一个字节输出流，写入文件
        FileOutputStream fos = new FileOutputStream(fo);
        //创建一个转换流（字符转换为字节流）
        OutputStreamWriter osw=new OutputStreamWriter(fos,StandardCharsets.UTF_8);

        //创建字符数组，将字符写入文件
        char[] c=new char[20];
        int len=isr.read(c);
        while(len!=-1){
            osw.write(c,0,len);
            len=isr.read(c);
        }
        //关闭流
        osw.close();
        isr.close();

    }


}
