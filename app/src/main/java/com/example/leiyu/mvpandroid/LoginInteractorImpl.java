package com.example.leiyu.mvpandroid;

import android.os.Handler;

/**
 * Created by leiyu on 2018/4/16.
 */

public class LoginInteractorImpl implements LoginInteractor{

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                if(username.equals("")){
                    listener.onUsernameError();
                    return;
                }
                if(password.equals("")){
                    listener.onPasswordError();
                    return;
                }
                listener.onSuccess();
            }
        }, 2000);
    }
}
