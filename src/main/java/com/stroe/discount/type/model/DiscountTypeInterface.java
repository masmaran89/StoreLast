/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.stroe.discount.type.model;

import com.stroe.discount.type.DiscountType;
import java.util.ArrayList;

/**
 *
 * @author masmaran
 */
public interface DiscountTypeInterface {

    public DiscountType getDiscountTypeById(long id);

    public ArrayList<DiscountType> getDiscountTypes();

}
