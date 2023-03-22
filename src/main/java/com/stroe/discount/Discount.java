package com.stroe.discount;

import com.stroe.discount.model.*;
import com.stroe.discount.type.DiscountType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Dell
 */
@Setter
@Getter
@Builder
public class Discount {

    private long id;
    private DiscountType discountType;
    private double discountValue;

    public Discount(long id, DiscountType discountType, double discountValue) {
        this.id = id;
        this.discountType = discountType;
        this.discountValue = discountValue;
    }

   

    public Discount() {
    }
    
    

}
