/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.discount.type.model;

import com.stroe.Constants;
import com.stroe.discount.type.DiscountType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author masmaran
 */
@Service
public class DiscountTypeModel implements DiscountTypeInterface {

    /**
     * *************************************************************************************************************
     */
    private static ArrayList<DiscountType> discountTypes = new ArrayList<>();

    @Override
    public DiscountType getDiscountTypeById(long id) {

        DiscountType discountType = null;

        for (DiscountType disType : getDiscountTypes()) {

            if (disType.getId() == id) {

                discountType = disType;

            }

        }

        return discountType;
    }

    @Override
    public ArrayList<DiscountType> getDiscountTypes() {

        if (!discountTypes.isEmpty()) {
            return discountTypes;
        }

        long id = Constants.DISCOUNT_PERCENTAGE_EMPLOYEE_ID;
        String name = " DISCOUNT PERCENTAGE EMPLOYEE ";
        double discountPercentage = Constants.DISCOUNT_PERCENTAGE_EMPLOYEE;

        DiscountType discountType = new DiscountType(id, name, discountPercentage);

        discountTypes.add(discountType);

        id = Constants.DISCOUNT_PERCENTAGE_REGULAR_CUSTOMER_ID;
        name = " DISCOUNT PERCENTAGE REGULAR CUSTOMER ";
        discountPercentage = Constants.DISCOUNT_PERCENTAGE_REGULAR_CUSTOMER;

        discountType = new DiscountType(id, name, discountPercentage);

        discountTypes.add(discountType);

        id = Constants.DISCOUNT_PERCENTAGE_EVERY_100_ID;
        name = " DISCOUNT PERCENTAGE EVERY 100 ";
        discountPercentage = Constants.DISCOUNT_PERCENTAGE_EVERY_100;

        discountType = new DiscountType(id, name, discountPercentage);

        discountTypes.add(discountType);

        return discountTypes;

    }

}
