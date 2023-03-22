/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.bill;

import com.stroe.discount.Discount;
import com.stroe.product.Product;
import com.stroe.user.User;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Dell
 */
@Setter
@Getter
@Builder
public class Bill {

    private long id;
    private User user;
    private List<Product> products;
    private List<Discount> discounts;
    private double totalPriceBeforeDiscount;
    private double totalPriceAfterDiscount;
    private double totalDiscount;

    public Bill() {
    }

    public Bill(long id, User user, List<Product> products, List<Discount> discounts, double totalPriceBeforeDiscount, double totalPriceAfterDiscount, double totalDiscount) {
        this.id = id;
        this.user = user;
        this.products = products;
        this.discounts = discounts;
        this.totalPriceBeforeDiscount = totalPriceBeforeDiscount;
        this.totalPriceAfterDiscount = totalPriceAfterDiscount;
        this.totalDiscount = totalDiscount;
    }

    

    



    

}
