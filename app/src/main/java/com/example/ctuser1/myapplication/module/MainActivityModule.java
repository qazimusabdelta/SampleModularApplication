package com.example.ctuser1.myapplication.module;

import android.content.Context;

import com.example.ctuser1.myapplication.RoadNavigator;
import com.example.ctuser1.myapplication.imageLoader.ImageDownloaderImpl;
import com.example.mode.IRoadNavigator;
import com.example.mode.ImageDownloader;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ctuser1 on 12/6/17.
 */

@Module
public class MainActivityModule {

    @Provides
    ImageDownloader provideImageDownloader(Context context){
        return new ImageDownloaderImpl(context);
    }

    @Provides
    IRoadNavigator provideRoadNavigator(Context context) {
        return new RoadNavigator(context);
    }
}
