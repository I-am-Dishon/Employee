/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee.app.dao;

import com.employee.app.model.User;

/**
 *
 * @author n
 */

public interface UserDaoImpl {
//    public void setDataSource(DataSource dataSource);
    public void insertUser(User user);
}
