package com.example.leiyu.mvpandroid;

/**
 * Created by leiyu on 2018/4/16.
 */

public interface LoginView {
    void showProgress();
    void hideProgress();
    void setUsernameError();
    void setPasswordError();
    void navigateToHome();
}
