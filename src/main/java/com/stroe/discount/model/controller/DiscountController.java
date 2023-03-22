/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.discount.model.controller;

import com.stroe.discount.Discount;
import com.stroe.discount.model.DiscountComponentInterface;
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
@RequestMapping(value = "discount/")
public class DiscountController {

    @RequestMapping(value = "/")
    public String greeting() {

        return "";
    }
    @Autowired
    DiscountComponentInterface discountComponentInterface;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Discount> getDiscount(@PathVariable String id) {
        System.out.println("id ااااااااااااا === " + id);
        System.out.println("id 2 ااااااااااااا === " + id);

        Discount result = discountComponentInterface.getDiscountById(Long.parseLong(id));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping(value = "/")
    public ResponseEntity<Iterable<Discount>> getDiscouns() {
         
          
        System.out.println("getBills 2 ااااااااااااا === " ); 

        Iterable<Discount> result = discountComponentInterface.getDiscounts();

        return new ResponseEntity<>(result, HttpStatus.OK);
    }


}
