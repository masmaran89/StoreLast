/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.discount.type.model;

import com.stroe.discount.type.DiscountType;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author masmaran
 */
@Component
public class DiscountTypeComponentModel implements DiscountTypeComponentInterface {

    @Autowired
    private DiscountTypeInterface discountTypeInterface;


    
    @Transactional
    @Override
    public Iterable<DiscountType> getDiscountTypes() {
        return discountTypeInterface.getDiscountTypes();
    }

    @Transactional
    @Override
    public DiscountType getDiscountTypeById(long id) {

        return discountTypeInterface.getDiscountTypeById(id);
    }

    

}
