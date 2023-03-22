/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.product.model.controller;

import com.stroe.product.Product;
import com.stroe.product.model.ProductComponentInterface;
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
@RequestMapping(value = "product/")
public class ProductController {

    @RequestMapping(value = "/")
    public String greeting() {

        return "";
    }
    @Autowired
    ProductComponentInterface productComponentInterface;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable String id) {
        System.out.println("id ااااااااااااا === " + id);
        System.out.println("id 2 ااااااااااااا === " + id);

        Product result = productComponentInterface.getProductById(Long.parseLong(id));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping(value = "/")
    public ResponseEntity<Iterable<Product>> getProducts() {
         
          
        System.out.println("getBills 2 ااااااااااااا === " );

        Iterable<Product> result = productComponentInterface.getProducts();

        return new ResponseEntity<>(result, HttpStatus.OK);
    }


}
