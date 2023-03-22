/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.stroe.user.model;

import com.stroe.user.User;

/**
 *
 * @author masmaran
 */
public interface UserInterface {

    public User getUserById(long id);

    public Iterable<User> getUsers();

}
