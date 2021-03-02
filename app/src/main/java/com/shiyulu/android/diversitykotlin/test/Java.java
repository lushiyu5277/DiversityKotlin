package com.shiyulu.android.diversitykotlin.test;

import com.shiyulu.android.diversitykotlin.utils.TimeUtilKt;
import com.shiyulu.android.diversitykotlin.utils.UIUtils;

public class Java {

    public static float getDpToPixel(float dp) {
        return UIUtils.dpToPixel(dp);
    }

    public static long now() {
        return TimeUtilKt.now();
    }
}
