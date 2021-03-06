package com.example.androidsurs.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.androidsurs.R
import com.example.androidsurs.ui.main.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        },2500)
    }
}