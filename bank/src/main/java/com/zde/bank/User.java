package com.zde.bank;

import java.io.Serializable;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/28 19:56
 */
public class User implements Serializable {


    private static final long serialVersionUID = 143606059397139269L;

    private String aname;
    private String apassword;
    private Float abalance;

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    public Float getAbalance() {
        return abalance;
    }

    public void setAbalance(Float abalance) {
        this.abalance = abalance;
    }

    public User() {
    }

    public User(String aname, String apassword, Float abalance) {
        this.aname = aname;
        this.apassword = apassword;
        this.abalance = abalance;
    }
}
