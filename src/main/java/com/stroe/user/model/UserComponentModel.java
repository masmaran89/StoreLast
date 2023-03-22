/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.user.model;

import com.stroe.user.User;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author masmaran
 */
@Component
public class UserComponentModel implements UserComponentInterface {

    @Autowired
    private UserInterface userInterface;

    @Transactional
    @Override
    public Iterable<User> getUsers() {
        return userInterface.getUsers();
    }

    @Transactional
    @Override
    public User getUserById(long id) {

        return userInterface.getUserById(id);
    }

}
