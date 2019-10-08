/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muqui.dao;

import com.muqui.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mq12
 */
@Repository("userDao")
public class UserDaoImp implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void saveUser(User user) {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);

        session.getTransaction().commit();
        System.out.println("GUARDADO OK ANGEL ANGEL ANGEL ANGEL ANGEL ANGEL ANGEL ANGEL ANGEL ANGEL ANGEL ANGEL ANGEL ANGEL ANGEL ANGEL");
    }

}
