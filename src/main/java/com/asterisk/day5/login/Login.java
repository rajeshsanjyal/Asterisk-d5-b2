package com.asterisk.day5.login;

public abstract class Login implements LoginContract{
    @Override
    public void isValidUser(){
        //checks if the user is valid
        System.out.println("check if the user in our database");
    }
    public void process(){
        fetchFromSource();
        isValidUser();
    }
}
