/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.discount.model;

import com.stroe.bill.Bill;
import com.stroe.discount.Discount;
import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author masmaran
 */
@Component
public class DiscountComponentModel implements DiscountComponentInterface {

    @Autowired
    private DiscountInterface discountInterface;

    @Transactional
    @Override
    public Iterable<Discount> getDiscounts() {
        return discountInterface.getDiscounts();
    }

    @Transactional
    @Override
    public Discount getDiscountById(long id) {

        return discountInterface.getDiscountById(id);
    }

    @Transactional
    @Override
    public ArrayList<Discount> billDiscount(Bill bill) {

        return discountInterface.billDiscount(bill);
    }

}
