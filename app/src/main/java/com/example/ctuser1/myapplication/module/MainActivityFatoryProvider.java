package com.example.ctuser1.myapplication.module;

import android.app.Activity;

import com.example.mode.MainActivity;
import com.example.ctuser1.myapplication.injector.MainActivityInjector;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by ctuser1 on 12/7/17.
 */

@Module(subcomponents = MainActivityInjector.class)
public abstract class MainActivityFatoryProvider {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindYourActivityInjectorFactory(MainActivityInjector.Builder builder);
}
