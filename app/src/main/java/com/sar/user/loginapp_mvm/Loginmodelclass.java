package com.sar.user.loginapp_mvm;

import android.text.TextUtils;

public class Loginmodelclass implements LoginModel {
    LoginPresent loginPresent;
    public Loginmodelclass(LoginPresent loginPresent)
    {
        this.loginPresent=loginPresent;
    }
    @Override
    public void onRecive(String username, String password) {
        if(username.equals("xyz@gmail.com")&& password.equals("12345"))
             loginPresent.onSuccess();
        else
            loginPresent.onFailure();
    }

}
