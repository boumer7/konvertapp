package com.kotlincodes.splashscreenwithkotlin

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.konvertapp.MainActivity
import com.example.konvertapp.R

class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long=1350 // 2.5 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)


        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this,MainActivity::class.java))

            overridePendingTransition(R.anim.slide_in, R.anim.slide_out)

            // close this activity
            finish()
        }, SPLASH_TIME_OUT)
    }
}
