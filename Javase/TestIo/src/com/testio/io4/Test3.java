package com.testio.io4;

import java.io.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 10:38
 * 键盘录入内容输出到文件中去
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        //键盘输入
        InputStream is=System.in;
        //字节流转换为字符流
        InputStreamReader isr =new InputStreamReader(is);
        //缓冲输入字符流
        BufferedReader br = new BufferedReader(isr);

        //目标文件
        File fo=new File("d:/test.txt");
        //输出字符流
        FileWriter fw = new FileWriter(fo);
        //缓冲输出字符流
        BufferedWriter bw = new BufferedWriter(fw);

        //操作输入输出
        String s=br.readLine();
//        while(s!=null){  死循环无法退出
        while(!s.equals("exit")){
            bw.write(s);
            bw.newLine();
            s=br.readLine();
        }

        //关闭流
        bw.close();
        br.close();
    }
}
