/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muqui.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author mq12
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    // Create 2 users for demo
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user").password("123456").roles("USER")
                .and()
                .withUser("admin").password("123456").roles("USER", "ADMIN");

    }

    // Secure the endpoins with HTTP Basic authentication
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                //HTTP Basic authentication
                .httpBasic()
                .and()
                .authorizeRequests()
                 .antMatchers("/user/**").access("hasRole('ADMIN') ")
//                .antMatchers(HttpMethod.GET, "/user/**").hasRole("ADMIN")
//                .antMatchers(HttpMethod.POST, "/user").hasRole("ADMIN")
//                .antMatchers(HttpMethod.PUT, "/user/**").hasRole("ADMIN")
//                .antMatchers(HttpMethod.PATCH, "/user/**").hasRole("ADMIN")
//                .antMatchers(HttpMethod.DELETE, "/user/**").hasRole("ADMIN")
                .and()
                .csrf().disable()
                .formLogin().disable();
    }

   

}
