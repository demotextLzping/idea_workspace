package com.testio.io6;

import java.io.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 12:20
 * 对象流，见序列化的数据写入到程序中
 */
public class TestRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建对象流输入对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("d:/test.txt")));
        //读取对象流写入的数据
        Person p= (Person)(ois.readObject());
        System.out.println(p);
        //关闭流
    }
}
