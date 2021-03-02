@file:JvmName("UIUtils")
package com.shiyulu.android.diversitykotlin.utils

import android.content.res.Resources
import android.util.TypedValue

fun dpToPixel(dp: Float): Float{
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, Resources.getSystem().displayMetrics)
}