/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.bill.model;

import com.stroe.bill.Bill;
import com.stroe.discount.Discount;
import com.stroe.discount.model.DiscountComponentInterface;
import com.stroe.product.Product;
import com.stroe.product.model.ProductComponentInterface;
import com.stroe.user.User;
import com.stroe.user.model.UserComponentInterface;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author masmaran
 */
@Service
public class BillModel implements BillInterface {

    /**
     * *************************************************************************************************************
     */
    @Autowired
    private UserComponentInterface userComponentInterface;

    @Autowired
    private ProductComponentInterface productComponentInterface;

    @Autowired
    private DiscountComponentInterface discountComponentInterface;

    private static ArrayList<Bill> bills = new ArrayList<Bill>();

    @Override
    public Bill getBillById(long id) {

        Bill bill = null;

        for (Bill bi : getBills()) {

            if (bi.getId() == id) {

                bill = bi;

            }

        }

        return bill;
    }

    @Override
    public ArrayList<Bill> getBills() {

        System.out.println(" xxxxx ");

        System.out.println(" bills.isEmpty() === " + bills.isEmpty());

        if (!bills.isEmpty()) {
            return bills;
        }

        Bill bill = new Bill();
        System.out.println(" 1111111111 === ");

        long id = 1;
        double totalPriceBeforeDiscount = 0.0;
        System.out.println(" 22222 === ");

        User user = userComponentInterface.getUserById(1);
        System.out.println(" 333333 === ");
        System.out.println(" user === " + user);
        bill.setUser(user);

        List<Product> products = new ArrayList<Product>();
        Product product = productComponentInterface.getProductById(1);
        System.out.println(" product === " + product);

        System.out.println(" 44444 === ");
        System.out.println(" product.getPrice() === " + product.getPrice());

        totalPriceBeforeDiscount = totalPriceBeforeDiscount + product.getPrice();
        System.out.println(" 5555 === ");

        products.add(product);
        product = productComponentInterface.getProductById(2);

        System.out.println(" 6666 === ");
        totalPriceBeforeDiscount = totalPriceBeforeDiscount + product.getPrice();
        System.out.println(" 7777 === ");

        products.add(product);
        System.out.println(" 8888 === ");
        bill.setProducts(products);
        bill.setTotalPriceBeforeDiscount(totalPriceBeforeDiscount);

        List<Discount> discounts = discountComponentInterface.billDiscount(bill);

        System.out.println(" 9999 === ");

        double totalDiscount = 0;
        for (Discount discount : discounts) {

            totalDiscount = totalDiscount + discount.getDiscountValue();

        }

        double totalPriceAfterDiscount = totalPriceBeforeDiscount - totalDiscount;

        bill.setId(id);
        bill.setDiscounts(discounts);
        bill.setTotalDiscount(totalDiscount);
        bill.setTotalPriceAfterDiscount(totalPriceAfterDiscount);

        bills.add(bill);

        return bills;

    }

    @Override
    public Bill addBill(Bill bill) {

        double totalPriceBeforeDiscount = 0.0;
        System.out.println(" 22222 === ");
        long userId = bill.getUser().getId();

        System.out.println(" userId === " + userId);

        User user = userComponentInterface.getUserById(userId);
        System.out.println(" 333333 === ");
        System.out.println(" user === " + user);
        bill.setUser(user);

        List<Product> products = bill.getProducts();
        for (int i = 0; i < products.size(); i++) {
            Product productOld = products.get(i);

            Product product = productComponentInterface.getProductById(productOld.getId());
            products.set(i, product);
            System.out.println(" product === " + product);

            System.out.println(" 44444 === ");
            System.out.println(" product.getPrice() === " + product.getPrice());

            totalPriceBeforeDiscount = totalPriceBeforeDiscount + product.getPrice();
            System.out.println(" 5555 === ");

        }
                bill.setTotalPriceBeforeDiscount(totalPriceBeforeDiscount);

        bill.setProducts(products);

        List<Discount> discounts = discountComponentInterface.billDiscount(bill);

        System.out.println(" discounts size === " + discounts.size());

        double totalDiscount = 0;
        for (Discount discount : discounts) {

            totalDiscount = totalDiscount + discount.getDiscountValue();
            System.out.println(" totalDiscount === " + totalDiscount);
            System.out.println(" discount.getDiscountValue()s === " + discount.getDiscountValue());

        }

        double totalPriceAfterDiscount = totalPriceBeforeDiscount - totalDiscount;

        bill.setId(getBills().size() + 1);
        bill.setDiscounts(discounts);
        bill.setTotalDiscount(totalDiscount);
        bill.setTotalPriceAfterDiscount(totalPriceAfterDiscount);

        bills.add(bill);
        return bill;

    }

}
