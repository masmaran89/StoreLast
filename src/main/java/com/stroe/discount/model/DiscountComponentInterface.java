/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.stroe.discount.model;

import com.stroe.bill.Bill;
import com.stroe.discount.Discount;
import java.util.ArrayList;

/**
 *
 * @author masmaran
 */
public interface DiscountComponentInterface {

    public Discount getDiscountById(long id);

    public Iterable<Discount> getDiscounts();

    public ArrayList<Discount> billDiscount(Bill bill) ;
}
