/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.ims.dbutil;

import com.leapforg.ims.constant.DbConstant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sushant
 */
public class DbConnection {
    private Connection Conn=null;
    private PreparedStatement stmt=null; 
    
    public void open()throws ClassNotFoundException,SQLException
    {
      Class.forName(DbConstant.DB_DRIVER);
      Conn = DriverManager.getConnection(DbConstant.DB_URL, DbConstant.DB_USER, DbConstant.DB_PASSWORD);
   
    
    }
    public PreparedStatement initStatement(String sql) throws SQLException{
    stmt = Conn.prepareStatement(sql);
    return stmt;
    }
    
    public int executeUpdate() throws SQLException{
        return stmt.executeUpdate();
    }
     public ResultSet executeQuerry() throws SQLException{
         return stmt.executeQuery();
     }
    
    
    public void close() throws SQLException{
       if(Conn!=null && !Conn.isClosed()){
           Conn.close();
           Conn=null;
           
       }
        
    }
}
