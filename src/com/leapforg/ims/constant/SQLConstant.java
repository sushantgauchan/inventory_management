/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.ims.constant;

/**
 *
 * @author Sushant
 */
public class SQLConstant {
    public final static String USER_INSERT = "INSERT INTO " + TableConstant.USER_TABLE + "(username,password,email,status) VALUES(?,?,?,?)";
}
