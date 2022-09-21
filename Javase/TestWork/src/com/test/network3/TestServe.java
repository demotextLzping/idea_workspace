package com.test.network3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 15:34
 */
public class TestServe {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建服务器套接字，指定端口号
        ServerSocket ss=new ServerSocket(8080);
        //等着客户端发送数据
        Socket s = ss.accept(); //阻塞方法：等待接受客户端的数据，什么时候接收到数据，什么时候程序继续执行

        //创建输入流对象
        InputStream is=s.getInputStream();
        //创建对象流流接收客户端发送的对象
        ObjectInputStream ois = new ObjectInputStream(is);
        //将获取的对象的类型转为User类型
        User user=(User)(ois.readObject());
        boolean flag;
        if(user.getName().equals("张三") && user.getPwd().equals("123456")){
            flag=true;
        }else{
            flag=false;
        }

        //向客户端输出一句话 操作流--》输出流
        //创建OutputStream对象，向外发送数据
        OutputStream os=s.getOutputStream();
        //利用数据流可以事项发送字符串数据
        ObjectOutputStream oos=new ObjectOutputStream(os);
        oos.writeBoolean(flag);

        //关闭流和网络资源
        oos.close();
        os.close();
        ois.close();
        is.close();
        ss.close();

    }
}
