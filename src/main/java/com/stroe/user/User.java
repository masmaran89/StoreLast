/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.user;

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
public class User {

    private long id;
    private String name;
    private boolean isEmployee;
    private boolean isRegularCustomer;

    public User() {
    }

    public User(long id, String name, boolean isEmployee, boolean isRegularCustomer) {
        this.id = id;
        this.name = name;
        this.isEmployee = isEmployee;
        this.isRegularCustomer = isRegularCustomer;
    }

    
    
}
