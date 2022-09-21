package com.testio.io1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/16 11:56
 * io流文件复制  1.文件--》程序
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //1.有一个源文件文件
        File f = new File("d:/demo.txt");
        //2.利用FileReader这个流，将这个“管”怼到源文件上去\
        FileReader fr = new FileReader(f);
        //3.对源文件进行 “吸” 的操作\
        //对文件字节进行读取
        //方式1:
//        int n = fr.read();
//        while(n!=-1){
//              System.out.println(n+" "+(char)n);//输出字符的ASCII码对应的数和输出对应的字符
//             n = fr.read();
//         }
        //方式2:
        int n;
        while((n=fr.read())!=-1){
            System.out.println(n+" "+(char)n);//输出字符的ASCII码对应的数和输出对应的字符
        }
        //4.”管“不用了，要关闭 --》关闭流
        fr.close();
    }

}
