/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.discount.type.model.controller;

import com.stroe.discount.type.DiscountType;
import com.stroe.discount.type.model.DiscountTypeComponentInterface;
import com.stroe.user.User;
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
@RequestMapping(value = "discounttype/")
public class DiscountTypeController {

    @RequestMapping(value = "/")
    public String greeting() {

        return "";
    }
    @Autowired
    DiscountTypeComponentInterface discountTypeComponentInterface;

    @GetMapping(value = "/{id}")
    public ResponseEntity<DiscountType> getDiscountType(@PathVariable String id) {
        System.out.println("id ااااااااااااا === " + id);
        System.out.println("id 2 ااااااااااااا === " + id);

        DiscountType result = discountTypeComponentInterface.getDiscountTypeById(Long.parseLong(id));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping(value = "/")
    public ResponseEntity<Iterable<DiscountType>> getDiscountTypes() {
         
          
        System.out.println("getBills 2 ااااااااااااا === " );

        Iterable<DiscountType> result = discountTypeComponentInterface.getDiscountTypes();

        return new ResponseEntity<>(result, HttpStatus.OK);
    }


}
