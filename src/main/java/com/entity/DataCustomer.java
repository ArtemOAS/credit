package com.entity;

import com.sun.xml.internal.ws.developer.Serialization;

public class DataCustomer {

    @Serialization
    private String username;

    @Serialization
    private String password;

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
