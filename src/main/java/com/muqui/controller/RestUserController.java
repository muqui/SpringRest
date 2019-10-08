/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muqui.controller;

import com.muqui.model.User;
import com.muqui.model.UserOld;
import com.muqui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mq12
 */
@RestController
public class RestUserController {
    
     @Autowired
    UserService userService;
    
    
     /*---Get a user by id---*/
   @GetMapping("/user/{id}")
   public ResponseEntity<UserOld> get(@PathVariable("id") long id) {
      UserOld user = new UserOld("Alberto Corona", 1);
       User userx = new User(2,"muqui", "corona", 1);
     userService.saveUser(userx);
      return ResponseEntity.ok().body(user);
   }
   
    /*---Add new book---*/
   @PostMapping("/user")
   public ResponseEntity<?> save(@RequestBody UserOld user) {
    // User userx = new User("muqui", "corona", 1);
   //  userService.saveUser(userx);
      return ResponseEntity.ok().body("New Book has been saved with ID:"+ user.getId());
   }
}
