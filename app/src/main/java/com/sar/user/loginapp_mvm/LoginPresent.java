package com.sar.user.loginapp_mvm;

import android.util.Log;

public class LoginPresent implements LoginPresenter {
    LoginView loginView;
    Loginmodelclass loginModel;
    public LoginPresent(LoginView loginView1)
    {
        this.loginView=loginView1;
        loginModel=new Loginmodelclass(this);

    }

    @Override
    public void onHandle(String username, String password) {
        loginModel.onRecive(username,password);

    }

    @Override
    public void onSuccess() {
        loginView.onSuccess();

    }

    @Override
    public void onFailure() {
        loginView.onFailure();

    }

    @Override
    public void onError(String message) {

    }
}
