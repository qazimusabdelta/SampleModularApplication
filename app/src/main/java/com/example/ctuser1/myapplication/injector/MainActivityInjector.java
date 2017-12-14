package com.example.ctuser1.myapplication.injector;

import com.example.ctuser1.myapplication.module.MainActivityModule;
import com.example.mode.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by ctuser1 on 12/7/17.
 */

@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityInjector extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivity> {}

}
