package com.tran.ebay.model;

import java.io.File;

public class User {
    private  String user;
    private  String pwd;


    public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }

    public User setUser(String user) {
        this.user = user;
        return  this;
    }

    public User setPwd(String pwd) {
        this.pwd = pwd;
        return  this;
    }
}