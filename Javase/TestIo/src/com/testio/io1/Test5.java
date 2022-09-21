package com.testio.io1;

import java.io.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/18 9:40
 * io流 文件--》程序--》文件
 */
public class Test5 {
    public static void main(String[] args) throws IOException {
        //1.创建输入的源文件对象
        File fi = new File("d:/demo.txt");
        //2.创建输出的源文件对象
        File fo = new File("d:/test.txt");

        //3.创建输入的FileReader对象
        FileReader fileReader = new FileReader(fi);
        //4.创建输出的FileWrite对象
        FileWriter fileWriter = new FileWriter(fo,true);

        //5.文件的读取和写入

        // a.一个一个字符的读取和写入
//        int n = fileReader.read();
//        while(n!=-1){
//            fileWriter.write(n);
//            n=fileReader.read();
//        }


        //b.利用缓冲数组读取和写入
//        char[] c=new char[5];
//        int len=fileReader.read(c);
//        while(len!=-1){
//            fileWriter.write(c,0,len);
//            len=fileReader.read(c);
//        }


        //c.利用字符串读取和写入
        char[] c=new char[5];
        int len=fileReader.read(c);
        while(len!=-1){
            String s=new  String(c,0,len);
            fileWriter.write(s);
            len=fileReader.read(c);
        }

        System.out.println("我是中国人");
        //6.关闭流（后使用的先关闭）
        fileWriter.close();
        fileReader.close();

    }
}
