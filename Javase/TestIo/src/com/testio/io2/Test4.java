package com.testio.io2;

import java.io.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/18 13:37
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        //1.创建输入的源文件对象
        File fi = new File("d:/demo.txt");
        //2.创建输出的源文件对象
        File fo = new File("d:/test.txt");
        //3.创建输入的FileReader对象
        FileReader fr= new FileReader(fi);
        //4.创建输出的FileWrite对象
        FileWriter fw = new FileWriter(fo);
        //5。创建一个缓冲字符输入流对象
        BufferedReader br = new BufferedReader(fr);
        //6.创建一个缓冲字符输出流对象
        BufferedWriter bw = new BufferedWriter(fw);
        //7.文件的读取和写入
        //利用缓冲数组读取和写入
//        char[] c=new char[5];
//        int len=br.read(c);
//        while(len!=-1){
//            bw.write(c,0,len);
//            len=br.read(c);
//        }


        //c.利用字符串读取和写入
        String str= br.readLine();
        while(str!=null){

            bw.write(str);
            bw.newLine();
            str=br.readLine();

        }

        //8.关闭流（后使用的先关闭）
        bw.close();
        br.close();
    }
}
