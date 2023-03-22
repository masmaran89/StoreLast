/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.bill.model.controller;

import com.stroe.bill.Bill;
import com.stroe.bill.model.BillComponentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author masmaran
 */
@CrossOrigin
@RestController
@RequestMapping(value = "bill/")
public class BillController {

    @RequestMapping(value = "/")
    public String greeting() {

        return "";
    }
    @Autowired
    BillComponentInterface billComponentInterface;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Bill> getBill(@PathVariable String id) {
        System.out.println("id ااااااااااااا === " + id);
        System.out.println("id 2 ااااااااااااا === " + id);

        Bill result = billComponentInterface.getBillById(Long.parseLong(id));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping(value = "/")
    public ResponseEntity<Iterable<Bill>> getBills() {
         
          
        System.out.println("getBills 2 ااااااااااااا === " );

        Iterable<Bill> result = billComponentInterface.getBills();

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping(value = "/")
    public ResponseEntity<Bill> addBill(@RequestBody Bill bill) {

        System.out.println(" addOrderDetails == ");

        Bill result = billComponentInterface.addBill(bill);
        return new ResponseEntity<>(result, HttpStatus.CREATED);

    }

}
