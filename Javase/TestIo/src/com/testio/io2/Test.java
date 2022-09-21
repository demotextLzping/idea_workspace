package com.testio.io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/18 10:22
 *  FileInputSteam和FileOutputSteam
 * 利用字节流 : 文件--》程序
 */
public class Test {
    public static void main(String[] args) throws IOException {

        File f = new File("d:/demophoto.jpg");

        FileInputStream fis = new FileInputStream(f);
        int count =0;
        //一个字节一个字节的读
//        int n=fis.read();
//        while(n!=-1){
//            System.out.println(n);
//            count++;
//            n= fis.read();
//        }
//        System.out.println(count);

        //利用缓冲数组

        byte[] bytes = new byte[1024];
        int len=fis.read(bytes);
        while(len!=-1){
            for (int i = 0; i <len ; i++) {
                System.out.println(bytes[i]);
                count++;
            }

            len= fis.read(bytes);
        }
        System.out.println(count);
        fis.close();

    }
}
