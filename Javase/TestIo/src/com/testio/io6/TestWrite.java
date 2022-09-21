package com.testio.io6;

import java.io.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 12:15
 */
public class TestWrite {
    public static void main(String[] args) throws IOException {
        //实例化对象
        Person p = new Person("lili",20);
        //创建输出对象流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("d:/test.txt")));
        //写入到文件中
        oos.writeObject(p);
        //关闭流
        oos.close();
    }
}
