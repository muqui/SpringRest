/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muqui.config;

/**
 *
 * @author mq12
 */
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
 /*Lugar donde se buscan los controladores*/
@ComponentScan(basePackages = { "com.muqui.controller" })
public class WebConfig extends WebMvcConfigurerAdapter {

}
