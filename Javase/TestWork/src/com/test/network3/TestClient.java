package com.test.network3;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 15:23
 */
public class TestClient {
    public static void main(String[] args) throws IOException {
        Socket s = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        InputStream is = null;
        OutputStream os=null;
        try {
            //创建套接字，指定服务器和端口号
            s = new Socket("127.0.0.1", 8080);
            //创建OutputStream对象，向外发送数据
            os= s.getOutputStream();
            //创建两个对象name和pwd，从键盘输入
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的用户名 : ");
            String name = sc.next();
            System.out.println("请输入您的账户密码 : ");
            String pwd = sc.next();
            //将两个属性封装进对象
            User user = new User(name, pwd);
            //利用对象流将user对象发送到服务器端
            oos = new ObjectOutputStream(os);
            oos.writeObject(user);

            //接受服务器发来的数据
            is = s.getInputStream();
            //创建数据流输入对象
            ois = new ObjectInputStream(is);
            //读取客户端发来的数据，再判断用户和密码的正确与否
            boolean b = ois.readBoolean();
            if (b) {
                System.out.println("登陆成功");
            } else {
                System.out.println("登录失败");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流和网络资源
            try{
                if (ois != null) {
                    ois.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
            try{
                if (is != null) {
                    is.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
            try{
                if (oos != null) {
                    oos.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
            try{
                if (os != null) {
                    os.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
            try{
                if (s != null) {
                    s.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
