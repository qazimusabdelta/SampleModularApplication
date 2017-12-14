package com.example.ctuser1.myapplication.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ctuser1 on 12/7/17.
 */

@Module(includes = MainActivityFatoryProvider.class)
public class AppModule {

    private final Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context getContext() {
        return context;
    }

}
