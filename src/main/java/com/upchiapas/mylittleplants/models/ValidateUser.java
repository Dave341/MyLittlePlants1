package com.upchiapas.mylittleplants.models;


import java.util.ArrayList;

public class ValidateUser {
    private static ArrayList<User> users;

    private User finUser(String userName){
        User user = null;
        boolean status = false;
        int index = 0;
        while (!status && index<users.size()){
            if(users.get(index).getUserName().equals(userName)) {
                user = users.get(index);
                status = true;
            }
            index++;
        }
        return user;
    }
    public boolean autenticarUser(String userName, String password){
        ValidarNewUser.setLitsuser(new User("David","Dave343","monster343","dagg@hotmail.com"));
        ValidarNewUser.setLitsuser(new User("Brandon","brandon123","vs357","brandonsm03@gmil.com"));
        users = ValidarNewUser.getLitsuser();
        boolean status = false;
        User user = finUser(userName);
        if (user!= null && user.getPassword().equals(password))
            status = true;
        return status;
    }
}
