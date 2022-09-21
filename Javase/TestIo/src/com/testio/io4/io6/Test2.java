package com.testio.io4.io6;

import java.io.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 11:37
 * 对象流 将文件中的数据读取到程序中
 */
public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("d:/test.txt")));
//        String s = (String) (ois.readObject());
//        System.out.println(s);
        System.out.println(ois.readInt());

        ois.close();

    }
}
