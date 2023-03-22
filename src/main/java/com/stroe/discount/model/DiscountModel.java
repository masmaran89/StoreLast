/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.discount.model;

import com.stroe.Constants;
import com.stroe.discount.Discount;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.stroe.bill.Bill;
import com.stroe.discount.type.DiscountType;
import com.stroe.discount.type.model.DiscountTypeComponentInterface;
import com.stroe.user.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author masmaran
 */
@Service
public class DiscountModel implements DiscountInterface {

    @Autowired
    private DiscountTypeComponentInterface discountTypeComponentInterface;

    /**
     * *************************************************************************************************************
     */
    private static ArrayList<Discount> discounts = new ArrayList<Discount>();

    @Override
    public Discount getDiscountById(long id) {

        return null;//productRepository.findById(id).get();
    }

    @Override
    public ArrayList<Discount> getDiscounts() {

        return null;//productRepository.findAll();

    }

    @Override
    public ArrayList<Discount> billDiscount(Bill bill) {

        ArrayList<Discount> discounts = new ArrayList<>();

        double totalPriceBeforeDiscount = bill.getTotalPriceBeforeDiscount();

        User user = bill.getUser();

        double discountPrice = 0;
        
                System.out.println(" \n \n ********************************* " );

        System.out.println(" user === " + user);
        System.out.println(" user.isEmployee() === " + user.isEmployee());
        System.out.println(" user.isRegularCustomer() === " + user.isRegularCustomer());
         System.out.println(" totalPriceBeforeDiscount === " + totalPriceBeforeDiscount);

        
        if (user.isEmployee()) {
        Discount discount = new Discount();

            DiscountType discountType = discountTypeComponentInterface.getDiscountTypeById(Constants.DISCOUNT_PERCENTAGE_EMPLOYEE_ID);
            System.out.println(Constants.DISCOUNT_PERCENTAGE_EMPLOYEE_ID + " ==== Constants.DISCOUNT_PERCENTAGE_EMPLOYEE_ID discountType === " + discountType);
            System.out.println(Constants.DISCOUNT_PERCENTAGE_EMPLOYEE_ID + " ==== Constants.DISCOUNT_PERCENTAGE_EMPLOYEE_ID discountType name === " + discountType.getName());

            discountPrice = billDiscountCalculation(totalPriceBeforeDiscount, discountType.getDiscountPercentage());
                System.out.println(" discountPrice === " + discountPrice);

            discount.setDiscountType(discountType);
            discount.setDiscountValue(discountPrice);
            discounts.add(discount);

        }

        if (user.isRegularCustomer()) {
        Discount discount = new Discount();

            DiscountType discountType = discountTypeComponentInterface.getDiscountTypeById(Constants.DISCOUNT_PERCENTAGE_REGULAR_CUSTOMER_ID);
            discountPrice = billDiscountCalculation(totalPriceBeforeDiscount, discountType.getDiscountPercentage());
            discount.setDiscountType(discountType);
            discount.setDiscountValue(discountPrice);
            discounts.add(discount);

        }
        Discount discount = new Discount();

        DiscountType discountType = discountTypeComponentInterface.getDiscountTypeById(Constants.DISCOUNT_PERCENTAGE_EVERY_100_ID);
        discountPrice = billEVERY100Calculation(totalPriceBeforeDiscount, discountType.getDiscountPercentage());
        discount.setDiscountType(discountType);
        discount.setDiscountValue(discountPrice);
        discounts.add(discount);

        bill.getTotalPriceBeforeDiscount();
        return discounts;
    }

    @Override
    public double billDiscountCalculation(double price, double percentage) {
        
                System.out.println(" billDiscountCalculation percentage === " + percentage);
                System.out.println(" billDiscountCalculation price === " + price);


        double discount = Math.floor((percentage / 100.) * price);

        return discount;
    }

    @Override
    public double billEVERY100Calculation(double price, double percentage) {

                System.out.println("price === "+price);

        System.out.println("percentage === "+percentage);
        double discount = Math.floor(price / 100.)*percentage;
        System.out.println("discount === "+discount);


        return discount;
    }

}
