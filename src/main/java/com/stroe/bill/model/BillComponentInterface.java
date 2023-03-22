/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.stroe.bill.model;

import com.stroe.bill.Bill;

/**
 *
 * @author masmaran
 */
public interface BillComponentInterface {

    public Bill getBillById(long id);

    public Iterable<Bill> getBills();

    public Bill addBill(Bill bill);

}
