package com.test.network3;

import java.io.Serializable;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/20 16:22
 */
public class User  implements Serializable {
    private static final long serialVersionUID = -7782449625234738853L;
    private String name;
    private String pwd;

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
