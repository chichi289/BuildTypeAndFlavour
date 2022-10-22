package com.chichi289.buildtypeflavour.driver.shared

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.chichi289.buildtypeflavour.BuildConfig
import com.chichi289.buildtypeflavour.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tvUrl).apply {
            text = "" +
                    "Url:- ${BuildConfig.BASE_URL}\n\n" +
                    "Application id:- ${BuildConfig.APPLICATION_ID}\n\n" +
                    "Build type:- ${BuildConfig.BUILD_TYPE}\n\n" +
                    "Build Flavor:- ${BuildConfig.FLAVOR}\n\n" +
                    "Build Variant:- ${"${BuildConfig.FLAVOR}${BuildConfig.BUILD_TYPE}"}\n\n" +
                    "Version code:- ${BuildConfig.VERSION_CODE}\n\n" +
                    "Version name:- ${BuildConfig.VERSION_NAME}"
        }
    }
}