package com.testio.io1;

import java.io.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/18 10:07
 * io流 文件--》程序--》文件
 * 异常处理
 */
public class Test6 {
    public static void main(String[] args) {
        //1.创建输入的源文件对象
        File fi = new File("d:/demo.txt");
        //2.创建输出的源文件对象
        File fo = new File("d:/test.txt");
        //3.创建输入的FileReader对象
        FileReader fileReader = null;
        //4.创建输出的FileWrite对象
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(fi);
            fileWriter = new FileWriter(fo,true);
            //5.文件的读取和写入
            //利用字符串读取和写入
            char[] c=new char[5];
            int len=fileReader.read(c);
            while(len!=-1){
                String s=new  String(c,0,len);
                fileWriter.write(s);
                len=fileReader.read(c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //6.关闭流（后使用的先关闭）
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
