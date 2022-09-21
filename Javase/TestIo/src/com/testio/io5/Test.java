package com.testio.io5;

import java.io.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 11:15
 * 利用DataOutputSteam向外写数据
 */
public class Test {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("d:/test.txt")));
        dos.writeUTF("中国人");
        dos.writeBoolean(true);
        dos.writeDouble(9.99);
        dos.writeInt(100);
        dos.close();
    }
}
