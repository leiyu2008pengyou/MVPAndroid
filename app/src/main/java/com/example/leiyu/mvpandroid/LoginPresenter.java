package com.example.leiyu.mvpandroid;

/**
 * Created by leiyu on 2018/4/16.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
