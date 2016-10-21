/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.ims;

import com.leapforg.ims.DAO.UserDAO;
import com.leapforg.ims.DAO.impl.UserDAOImpl;
import com.leapforg.ims.entity.User;
import com.leapforg.ims.ui.LoginUI;

/**
 *
 * @author Sushant
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //UserDAO userDAO = new UserDAOImpl();
        //try{
          //  userDAO.insert(new User(0, "Shriya", "shriya@gmail.com", "12345", true));
        //}catch(Exception e){
         //   System.out.println(e.getMessage());
       // }
       new LoginUI().setVisible(true);
    }
    
}
