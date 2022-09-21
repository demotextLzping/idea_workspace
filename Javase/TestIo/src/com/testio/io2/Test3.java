package com.testio.io2;

import java.io.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/18 13:04
 * 利用处理流处理文件
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        //1.创建一个源图片对象
        File fi = new File("d:/demophoto.jpg");
        //2.创建一个目标图片的对象
        File fo = new File("d:/testphoto.jpg");
        //3.创建一个字节输入流对象
        FileInputStream fis = new FileInputStream(fi);
        //4.创建一个字节输出流对象
        FileOutputStream fos=new  FileOutputStream(fo);
        //5.功能加强 在FileInputSteam外面套一个字节缓冲流 BufferedInputSteam
        BufferedInputStream bis = new BufferedInputStream(fis);
        //6.功能加强 在FileOutputSteam外面套一个字节缓冲流 BufferedOutputSteam
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //7.利用缓冲数组读取和写入
        byte[] bytes = new byte[1024];
        int len=bis.read(bytes);
        while(len!=-1){
            bos.write(bytes,0,len);
            len= bis.read(bytes);
        }

        //8.关闭流
        bos.close();
        bis.close();
        //如果字节缓冲流包裹着节点流，那麽只要关闭高级流（字节缓冲流）
//        fos.close();
//        fis.close();
    }
}
