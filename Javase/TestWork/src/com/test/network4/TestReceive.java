package com.test.network4;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.awt.dnd.DropTarget;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/21 10:28
 * 接收方
 */
public class TestReceive {
    public static void main(String[] args) throws IOException {
        System.out.println("老师上线了。。。");
        //1.创建套接字，指定接收方的端口
        DatagramSocket ds = new DatagramSocket(9999);
        //2.准备空的数据包，用来接收发送方发送的数据包
        byte[] b=new byte[1024];
        DatagramPacket dp = new DatagramPacket(b,b.length);
        //3.准备接收数据，将其放入准备的空数据包中
        ds.receive(dp);

        //4.取出数据
        byte[] data=dp.getData();
        String s=new String(data,0,dp.getLength());
        System.out.println("学生对我说 : "+s);

        //关闭资源
        ds.close();

    }
}
