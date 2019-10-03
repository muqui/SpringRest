/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muqui.controller;

import com.muqui.model.User;
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
     /*---Get a user by id---*/
   @GetMapping("/user/{id}")
   public ResponseEntity<User> get(@PathVariable("id") long id) {
      User user = new User("Alberto Corona", 1);
      return ResponseEntity.ok().body(user);
   }
   
    /*---Add new book---*/
   @PostMapping("/user")
   public ResponseEntity<?> save(@RequestBody User user) {
     
      return ResponseEntity.ok().body("New Book has been saved with ID:"+ user.getId());
   }
}
