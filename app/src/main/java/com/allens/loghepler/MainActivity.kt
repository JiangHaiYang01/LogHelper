package com.allens.loghepler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.allens.loghelper.LogHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogHelper.init(this, true)


        LogHelper.i("记录日志")

        LogHelper.d("debug");
        LogHelper.e("error");
        LogHelper.w("warning");
        LogHelper.v("verbose");
        LogHelper.i("information");
        LogHelper.wtf("What a Terrible Failure");
        LogHelper.d("hello %s", "world");
    }
}