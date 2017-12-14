package com.example.ctuser1.myapplication;

import android.content.Context;
import android.content.Intent;

import com.example.mode.IRoadNavigator;
import com.example.road.RoadActivity;

/**
 * Created by ctuser1 on 12/11/17.
 */

public class RoadNavigator implements IRoadNavigator {

    Context context;

    public RoadNavigator(Context context) {
        this.context = context;
    }

    @Override
    public void goToRoad() {
        context.startActivity(new Intent(context, RoadActivity.class));
    }
}
