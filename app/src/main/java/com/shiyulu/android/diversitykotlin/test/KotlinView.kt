package com.shiyulu.android.diversitykotlin.test

import android.view.View

class KotlinView {

    interface OnClickListener {

        fun onClick(view: View);
    }

    fun setOnClickListener(listener: (View) -> Unit) {

    }
}