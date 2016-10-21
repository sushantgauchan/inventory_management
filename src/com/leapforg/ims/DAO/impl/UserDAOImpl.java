/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.ims.DAO.impl;

import com.leapforg.ims.DAO.UserDAO;
import com.leapforg.ims.constant.SQLConstant;
import com.leapforg.ims.dbutil.DbConnection;
import com.leapforg.ims.entity.User;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Sushant
 */
public class UserDAOImpl implements UserDAO{
    private DbConnection db = new DbConnection();
            
    @Override
    public int insert(User t) throws SQLException, ClassNotFoundException {
        db.open();
        PreparedStatement stmt = db.initStatement(SQLConstant.USER_INSERT);
        stmt.setString(1, t.getUsername());
        stmt.setString(2, t.getPassword());
        stmt.setString(3, t.getEmail());
        stmt.setBoolean(4, t.isStatus());
        int result = db.executeUpdate();
        db.close();
        return result;
    }
    }
    

