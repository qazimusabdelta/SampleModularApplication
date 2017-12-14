package com.example.ctuser1.myapplication;

import com.example.mode.MainActivity;
import com.example.road.IModeService;

/**
 * Created by ctuser1 on 12/11/17.
 */

public class ModeService implements IModeService {
    @Override
    public String getMode() {
        return MainActivity.MODE;
    }
}
