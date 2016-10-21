/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.ims.DAO;

import java.sql.SQLException;

/**
 *
 * @author Sushant
 */
public interface GenericDAO<T> {
    int insert(T t) throws SQLException, ClassNotFoundException;
    
}
