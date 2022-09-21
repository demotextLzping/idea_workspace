package com.testio.io2;

import java.io.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/18 12:43
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        File fi = new File("d:/demophoto.jpg");
        File fo = new File("d:/testphoto.jpg");

        FileInputStream fis = new FileInputStream(fi);
        FileOutputStream fos=new  FileOutputStream(fo);
        //一个字节一个字节的读取和写入
//        int n=fis.read();
//        while(n!=-1){
//            fos.write(n);
//            count++;
//            n= fis.read();
//        }
//        System.out.println(count);

        //利用缓冲数组
        byte[] bytes = new byte[1024];
        int len=fis.read(bytes);
        while(len!=-1){
            fos.write(bytes,0,len);
            len= fis.read(bytes);
        }
        fos.close();
        fis.close();

    }
}
