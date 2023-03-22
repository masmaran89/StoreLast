/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.bill.model;

import com.stroe.bill.Bill;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author masmaran
 */
@Component
public class BillComponentModel implements BillComponentInterface {

    @Autowired
    private BillInterface billInterface;

    @Transactional
    @Override
    public Iterable<Bill> getBills() {
        return billInterface.getBills();
    }

    @Transactional
    @Override
    public Bill getBillById(long id) {

        return billInterface.getBillById(id);
    }
    
    
    

  
      @Transactional
    @Override
    public Bill addBill(Bill bill) {
        
        
        

        return billInterface.addBill(bill);
    }

    

}
