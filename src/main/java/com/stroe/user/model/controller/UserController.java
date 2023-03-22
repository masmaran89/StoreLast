/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.user.model.controller;

import com.stroe.user.User;
import com.stroe.user.model.UserComponentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author masmaran
 */
@CrossOrigin
@RestController
@RequestMapping(value = "user/")
public class UserController {
 
    @RequestMapping(value = "/")
    public String greeting() {

        return "";
    }
    @Autowired
    UserComponentInterface userComponentInterface;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getUser(@PathVariable String id) {
        System.out.println("id ااااااااااااا === " + id);
        System.out.println("id 2 ااااااااااااا === " + id);

        User result = userComponentInterface.getUserById(Long.parseLong(id));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping(value = "/")
    public ResponseEntity<Iterable<User>> getUsers() {
         
          
        System.out.println("getBills 2 ااااااااااااا === " );

        Iterable<User> result = userComponentInterface.getUsers();

        return new ResponseEntity<>(result, HttpStatus.OK);
    }


}
