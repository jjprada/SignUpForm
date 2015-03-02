package com.jjprada.signupform;

import java.io.Serializable;

/**
 * Created by Dr4ckO on 27/02/2015.
 */
public class User implements Serializable {
    private static final String TAG = "User";

    private String mUsername;
    private String mPassword;

    User (String username, String password){
        this.mUsername = username;
        this.mPassword = password;
    }

    public String getUsername() {
        return mUsername;
    }
}
