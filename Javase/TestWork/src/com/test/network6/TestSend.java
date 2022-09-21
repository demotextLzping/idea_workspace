package com.test.network6;

import java.io.IOException;
import java.net.*;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/21 10:20
 * 发送方
 */
public class TestSend {
    public static void main(String[] args){
        System.out.println("学生上线了。。。");
        DatagramSocket ds = null;
        DatagramPacket dp;
        DatagramPacket dp2;
        try {
            //1.准备套接字，指定发送方的端口号
            ds = new DatagramSocket(8888);
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
            dp = new DatagramPacket(b,b.length, InetAddress.getByName("localhost"),9999);
            ds.send(dp);
            //4.准备空的数据包，用来接收发送方发送的数据包
            byte[] br=new byte[1024];
            dp2 = new DatagramPacket(br,br.length);
            //5.准备接收数据，将其放入准备的空数据包中
            ds.receive(dp2);
            //6.取出数据
            byte[] data=dp2.getData();
            String s=new String(data,0,dp2.getLength());
            System.out.println("老师对我说 : "+s);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //7.关闭资源
            assert ds != null;
            ds.close();

        }


    }
}
