package com.testio.io1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/16 12:21
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //1.创建一个File类对象
        File f = new File("d:/demo.txt");
        //2.创建FileReader对象
        FileReader fr = new FileReader(f);
        //3.对源文件进行文件字节进行读取
        //一次读取多个字符
        char[] ch = new char[2];
        int len =fr.read(ch);  //len的值是读取的有效长度
        while(len!=-1){
            //方式1：
//            for(int i=0;i<len;i++){
//                System.out.println(ch[i]);
//            }
            //方式2：
            String s = new String(ch,0,len);
            System.out.println(s);
            len =fr.read(ch);
        }
        //4。关闭流
        fr.close();
    }
}
