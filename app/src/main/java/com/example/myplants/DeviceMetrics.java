package com.example.myplants;

import android.content.res.Resources;

public class DeviceMetrics {

    public static int getscreenwidth()
    {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }
}
