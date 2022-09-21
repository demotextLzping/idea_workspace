package com.test.entity;

import java.io.Serializable;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/8/11 10:56
 */
public class Account implements Serializable {
    private Integer aid;
    private String username;
    private String password;
    private double money;

    public Account() {
    }

    @Override
    public String toString() {
        return "Account2{" +
                "aid=" + aid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Account(Integer aid, String username, String password, double money) {
        this.aid = aid;
        this.username = username;
        this.password = password;
        this.money = money;
    }
}
