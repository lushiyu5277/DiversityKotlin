package com.shiyulu.android.diversitykotlin.test;

import android.view.View;

import com.shiyulu.android.diversitykotlin.utils.TimeUtilKt;
import com.shiyulu.android.diversitykotlin.utils.UIUtils;

import java.util.function.Function;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class Java {

    public static float getDpToPixel(float dp) {
        return UIUtils.dpToPixel(dp);
    }

    public static long now() {
        return TimeUtilKt.now();
    }

    public static void main(String []args) {
        KotlinView view = new KotlinView();
        view.setOnClickListener(new Function1<View, Unit>() {
            @Override
            public Unit invoke(View view) {
                return null;
            }
        });
//        Function
    }
}
