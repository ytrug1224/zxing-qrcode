package com.uuch.android_zxinglibrary;

import android.app.Application;

import com.uzxing.lib.activity.ZXingLibrary;

/**
 * Created by zxj on 16/9/7.
 */

public class MApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        ZXingLibrary.initDisplayOpinion(this);
    }
}
