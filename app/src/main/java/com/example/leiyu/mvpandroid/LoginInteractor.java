package com.example.leiyu.mvpandroid;

/**
 * Created by leiyu on 2018/4/16.
 */

public interface LoginInteractor {
    void login(String username, String password, OnLoginFinishedListener listener);

    interface OnLoginFinishedListener{
        void onUsernameError();
        void onPasswordError();
        void onSuccess();
    }
}
