package com.example.ctuser1.myapplication.component;

import com.example.ctuser1.myapplication.MyApp;
import com.example.ctuser1.myapplication.module.AppModule;

import dagger.Component;

/**
 * Created by ctuser1 on 12/7/17.
 */

@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MyApp application);

    @Component.Builder
    interface Builder {
        Builder withAppModule(AppModule appModule);

        AppComponent build();
    }
}
