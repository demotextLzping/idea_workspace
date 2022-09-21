package com.testio.io1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/16 12:52
 * io流   程序 --》文件
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        //1.创建一个File类对象 ，如果文件不存在则会自动创建一个文件
        File f = new File("d:/test.txt");
        //2.创建一个FileWriter对象，指向源文件
        FileWriter fw = new FileWriter(f,true);
        /**
         如果后面没有参数，或参数为false，则是覆盖操作，若参数为true则是追加操作
         */
        //3.将字符向外输出（即写入文件）
        //方式1：一个个字符往外输出
        String s="你好世界";
        for (int i=0;i<s.length();i++){
            fw.write(s.charAt(i));
        }
        //方式2：多个字符同时输出
        String s1="欢迎";
        s.toCharArray(); //将字符串转换为字符数组写入文件
        fw.write(s1);

        //4.关闭流
        fw.close();


    }
}
