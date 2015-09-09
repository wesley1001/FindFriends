package com.ashkin.findfriends.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by Ashkin on 2015/9/8.
 */
public class User extends BmobObject {

    private String username;
    private String password;

    public User() {
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
}
