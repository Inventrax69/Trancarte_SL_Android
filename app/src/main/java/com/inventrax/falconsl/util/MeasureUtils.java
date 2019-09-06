package com.inventrax.falconsl.util;


import com.inventrax.falconsl.application.AbstractApplication;

public class MeasureUtils {

    public static int pxToDp(int px) {
        final float scale = AbstractApplication.get().getResources().getDisplayMetrics().density;
        return (int) ((px * scale) + 0.5f);
    }

}
