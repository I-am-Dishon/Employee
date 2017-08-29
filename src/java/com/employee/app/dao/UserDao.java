/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee.app.dao;

import com.employee.app.model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author n
 */
public class UserDao extends JdbcDaoSupport implements UserDaoImpl{
    
    
    private JdbcTemplate jdbcTemplate;    
    private DataSource dataSource;
   
//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
    @Autowired
    public UserDao(){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
//    
    
//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//        this.jdbcTemplate = new JdbcTemplate(dataSource);
//    }
    
//    public void getJdbcTemplate(JdbcTemplate jdbcTemplate){
//        this.jdbcTemplate = jdbcTemplate;
//    }       
    
    @Override
    public void insertUser(User user) {
        
        String sql = "INSERT INTO  customers (username,email,password) VALUES (?,?,?)";
        
        
        //this.jdbcTemplate.update(sql, name,email,password);
           
        try{
            Connection conn = dataSource.getConnection();
//            try {
//                String DriverName="org.postgresql.Driver";
//                Class.forName(DriverName);
//                 String Url = "jdbc:postgres://localhost/Auction";
//                conn = DriverManager.getConnection(Url, "postgres", "goro");
//                conn = dataSource.getConnection();
//            } catch (SQLException | ClassNotFoundException ex) {
//                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
//                
//            }
                //this.jdbcTemplate = new JdbcTemplate(dataSource);
                getJdbcTemplate().update(sql, new Object[]{user.getUserName(),user.getEmail(),user.getPassword()});
            //jdbcTemplate.update(sql);

        } catch(DataAccessException e){

            String error =  e.getMessage();         
        
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
