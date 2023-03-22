/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.stroe.discount.model;

import com.stroe.discount.Discount;
import com.stroe.bill.Bill;
import java.util.ArrayList;

/**
 *
 * @author masmaran
 */
public interface DiscountInterface {

    public Discount getDiscountById(long id);

    public ArrayList<Discount> getDiscounts();

    public ArrayList<Discount> billDiscount(Bill bill);

    public double billDiscountCalculation(double price, double percentage);

    public double billEVERY100Calculation(double price, double percentage);

}
