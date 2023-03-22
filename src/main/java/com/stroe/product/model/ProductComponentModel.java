/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.product.model;

import com.stroe.product.Product;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author masmaran
 */
@Component
public class ProductComponentModel implements ProductComponentInterface {

    @Autowired
    private ProductInterface productInterface;

    @Transactional
    @Override
    public Iterable<Product> getProducts() {
        return productInterface.getProducts();
    }

    @Transactional
    @Override
    public Product getProductById(long id) {

        return productInterface.getProductById(id);
    }

    

}
