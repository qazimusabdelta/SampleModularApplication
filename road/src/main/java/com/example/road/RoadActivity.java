package com.example.road;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

/**
 * Created by ctuser1 on 12/7/17.
 */

public class RoadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road);

        AndroidInjection.inject(this);
    }
}
