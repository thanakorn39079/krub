package com.example.andtest1;

public class checkpass {
    private static final String EMAIL="thanakorn39079@sura.ac.th"; //**
    private static final String PASSWORD="kainoy234"; //**

    private String mEmail;
    private  String mPassword;

    public checkpass (String email,String password){
        this.mEmail=email;
        this.mPassword=password;
    }
    public boolean check() {
        if (mEmail.equals(EMAIL) && mPassword.equals(PASSWORD)) {
            return true;
        } else {
            return false;
        }
    }
}
