package com.lihui.bdmapdemo;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by LiHui on 17/9/26.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());
    }
}
