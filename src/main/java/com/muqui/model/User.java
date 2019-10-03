/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muqui.model;

/**
 *
 * @author mq12
 */
public class User {
    String nombre;
    int id;

    /*
    SIN ESTE CONSTRUCOTR SE OBTIENE EL SIGUIENTE ERROR:
     org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver.handleHttpMessageNotReadable Failed to read HTTP message: 
    org.springframework.http.converter.HttpMessageNotReadableException: JSON parse error: Can not construct instance of com.muqui.model.User: 
    no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, 
    or perhaps need to add/enable type information?); nested exception is com.fasterxml.jackson.databind.JsonMappingException: 
    Can not construct instance of com.muqui.model.User: no suitable constructor found, can not deserialize from Object value 
    (missing default constructor or creator, or perhaps need to add/enable type information?)
    */
    public User() {
    }

    public User(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
