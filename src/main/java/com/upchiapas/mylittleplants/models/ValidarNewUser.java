package com.upchiapas.mylittleplants.models;


import java.util.ArrayList;

public class ValidarNewUser {
    private static ArrayList<User> litsuser = new ArrayList<>();
    public static boolean validaruser(String userName,String password,String name,String mail){
        boolean status = true;
        boolean status2=false;
        int index = 0;
        if (password.equals("")||userName.equals("")||name.equals("")||mail.equals("")){
            status=false;
            status2=true;
        }
        while (!status2 && index<litsuser.size()){
            if(litsuser.get(index).getUserName().equals(userName)){
                status2=true;
                status=false;
            }
            index++;
        }
        return status;
    }

    public static ArrayList<User> getLitsuser() {
        return litsuser;
    }

    public static void setLitsuser(User user) {
        ValidarNewUser.litsuser.add(user);
    }
}
