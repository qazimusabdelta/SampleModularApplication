package com.example.ctuser1.myapplication;

import android.app.Activity;
import android.app.Application;


import com.example.ctuser1.myapplication.component.AppComponent;
import com.example.ctuser1.myapplication.component.DaggerAppComponent;
import com.example.ctuser1.myapplication.module.AppModule;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;

/**
 * Created by ctuser1 on 12/6/17.
 */

public class MyApp extends Application implements HasDispatchingActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> activityInjector;
    private static MyApp app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        AppComponent appComponent = DaggerAppComponent.builder().withAppModule(new AppModule(this)).build();
        appComponent.inject(this);
    }

    public static MyApp getApp() {
        return app;
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return activityInjector;
    }
}
