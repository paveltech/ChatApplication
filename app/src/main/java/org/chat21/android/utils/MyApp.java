package org.chat21.android.utils;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

public class MyApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }
}
