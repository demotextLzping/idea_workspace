package com.testio.io5;

import java.io.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 11:23
 * 利用DataInputStream 读取文件中数据
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(new File("d:/test.txt")));
        System.out.println(dis.readUTF());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readDouble());
        System.out.println(dis.readInt());
        dis.close();
    }
}
