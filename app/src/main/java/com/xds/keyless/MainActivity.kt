package com.xds.keyless

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.postDelayed({ Toast.makeText(this, "测试", Toast.LENGTH_LONG).show() }, 500)
    }
}