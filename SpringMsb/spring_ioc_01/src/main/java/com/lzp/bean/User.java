package com.lzp.bean;

import javax.swing.*;

public class User {
    private Integer userid;
    private String uname;
    private String password;
    public  void init(){
        System.out.println("第三步 初始化");
    }
    public void destory(){
        System.out.println("第五步 销毁");
    }

    public User() {
        System.out.println("第一步 构造");
    }

    public User(Integer userid, String uname, String password) {
        System.out.println("allArgConstructor");
        this.userid = userid;
        this.uname = uname;
        this.password = password;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
//        System.out.println("setUserid");
        this.userid = userid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        System.out.println("第二步 User set");
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
//        System.out.println("setPassword");
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
