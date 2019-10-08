/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muqui.controller;

import com.muqui.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.muqui.service.CarService;

/**
 *
 * @author mq12
 */
@RestController
public class RestUserController {
    
     @Autowired
    CarService userService;
    
    
     /*---Get a user by id---*/
   @GetMapping("/car/{id}")
   public ResponseEntity<Car> get(@PathVariable("id") long id) {  
       
      return ResponseEntity.ok().body(null);
   }
   
    /*---Add new book---*/
   @PostMapping("/car")
   public ResponseEntity<?> save(@RequestBody Car car) {
     
     userService.saveCar(car);
      return ResponseEntity.ok().body("New Car has been saved with Model:"+ car.getModel());
   }
}
