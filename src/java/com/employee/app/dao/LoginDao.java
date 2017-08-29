/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee.app.dao;

import com.employee.app.bean.UserBean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author n
 */
public class LoginDao {
    
    private JdbcTemplate jdbcTemplate;    
    
    String sql = "SELECT    user('username','password') VALUES (?,?)";
    public String authenticateUser(UserBean userBean) {
        String userName = userBean.getUserName(); //Keeping user entered values in temporary variables.
        String password = userBean.getPassword();
        
        sql = "SELECT customers ('username','password') VALUES (userName,password)";
        try{
            jdbcTemplate.update(sql);
            

        } catch(DataAccessException e){

            String error =  e.getMessage();
            System.out.println(error);

        }
    
        return null;
    }
    

        
}
    