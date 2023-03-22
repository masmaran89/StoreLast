/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.stroe.product.model;

import com.stroe.product.Product;

/**
 *
 * @author masmaran
 */
public interface ProductComponentInterface {

    public Product getProductById(long id);

    public Iterable<Product> getProducts();

}
