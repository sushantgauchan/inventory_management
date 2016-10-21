/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.ims.entity;

import java.util.Date;

/**
 *
 * @author Sushant
 */
public class UserLog {
    private int id;
    private User user;
    private Date loginDate;

    public UserLog() {
    }

    public UserLog(int id, User user, Date loginDate) {
        this.id = id;
        this.user = user;
        this.loginDate = loginDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
