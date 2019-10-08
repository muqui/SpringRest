/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muqui.service;

import com.muqui.dao.UserDao;
import com.muqui.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mq12
 */
@Service("userService")
@Transactional
public class UserServiceImp implements UserService{
        @Autowired
    private UserDao dao;

    @Override
    public void saveUser(User user) {
       dao.saveUser(user);
    }
    
}
