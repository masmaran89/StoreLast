/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.discount.type;

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
public class DiscountType {
    
    private long id;
    private String name;
    private double discountPercentage;

    public DiscountType() {
    }

    public DiscountType(long id, String name, double discountPercentage) {
        this.id = id;
        this.name = name;
        this.discountPercentage = discountPercentage;
    }
    
    
    
}
