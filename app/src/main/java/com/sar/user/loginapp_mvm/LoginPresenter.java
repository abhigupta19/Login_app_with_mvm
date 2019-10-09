package com.sar.user.loginapp_mvm;

public interface LoginPresenter {
    void onHandle(String username,String password);
    void onSuccess();
    void  onFailure();
    void  onError(String message);

}
