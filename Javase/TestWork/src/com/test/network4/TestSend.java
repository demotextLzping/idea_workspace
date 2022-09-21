package com.test.network4;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/21 10:20
 * 发送方
 */
public class TestSend {
    public static void main(String[] args) throws IOException {
        System.out.println("学生上线了。。。");
        //1.准备套接字，指定发送方的端口号
        DatagramSocket ds = new DatagramSocket(8888);
        //2.准备数据包
        String str="你好";
        byte[] b=str.getBytes();
        /**
         * 数据包需要四个参数
         * 1.将传输的数据转为字节数组
         * 2.字节数组的长度
         * 3.封装接收方的ip
         * 4.指定接收方的端口号
         */
        //3.发送数据
        DatagramPacket dp = new DatagramPacket(b,b.length, InetAddress.getByName("localhost"),9999);
        ds.send(dp);

        //4.关闭资源
        ds.close();

    }
}
