/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stroe.user.model;

import com.stroe.user.User;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 *
 * @author masmaran
 */
@Service
public class UserModel implements UserInterface {

    /**
     * *************************************************************************************************************
     */
    private static ArrayList<User> users = new ArrayList<User>();

    @Override
    public User getUserById(long id) {

        User user = null;

        for (User us : getUsers()) {

            if (us.getId() == id) {

                user = us;

            }

        }

        return user;
    }

    @Override
    public ArrayList<User> getUsers() {

        if (!users.isEmpty()) {
            return users;
        }

        long id = 1;
        String name = "Mohannad";
        boolean isEmployee = true;
        boolean isRegularCustomer = false;

        User user = new User(id, name, isEmployee, isRegularCustomer);

        users.add(user);

        id = 2;
        name = "Ali";
        isEmployee = false;
        isRegularCustomer = true;

        user = new User(id, name, isEmployee, isRegularCustomer);

        users.add(user);

        id = 3;
        name = "Abd";
        isEmployee = false;
        isRegularCustomer = false;

        user = new User(id, name, isEmployee, isRegularCustomer);

        users.add(user);

        return users;

    }

}
