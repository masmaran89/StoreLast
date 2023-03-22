/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.product.model;

import com.stroe.product.Product;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 *
 * @author masmaran
 */
@Service
public class ProductModel implements ProductInterface {

    /**
     * *************************************************************************************************************
     */
    private static ArrayList<Product> products = new ArrayList<Product>();

    @Override
    public Product getProductById(long id) {

        Product product = null;

        for (Product pro : getProducts()) {

            if (pro.getId() == id) {

                product = pro;

            }

        }

        return product;
    }

    @Override
    public ArrayList<Product> getProducts() {

        System.out.println(" products.isEmpty() === " + products.isEmpty());

        if (!products.isEmpty()) {
            return products;
        }

                System.out.println(" getProducts() 1111111 === ");

        
        long id = 1;
                        System.out.println(" getProducts() 222222 === ");

        String name = " Product 1 ";
                System.out.println(" getProducts() 3333333 === ");

        double price = 50.;
                System.out.println(" getProducts() 4444 === ");

        Product product = new Product(id, name, price);
                System.out.println(" getProducts() 555555 === ");

        products.add(product);

        id = 2;
        name = " Product 2 ";
        price = 150.;

        product = new Product(id, name, price);

        products.add(product);

        id = 3;
        name = " Product 3 ";
        price = 80.;

        product = new Product(id, name, price);

        products.add(product);

        return products;

    }

}
