package com.testio.io4.io6;

import java.io.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 11:30
 * 对象流--》写入文件
 */
public class Test {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("d:/test.txt")));
//        oos.writeObject("中国人");
        oos.writeInt(100);
        oos.close();
    }

}
