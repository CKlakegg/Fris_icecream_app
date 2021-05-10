package com.example.fris_icecream_app.ui.main.Splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.fris_icecream_app.MainActivity
import com.example.fris_icecream_app.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        val userOpenSide = false
        val activityIntent= if (userOpenSide) {
            Intent (this, MainActivity:: class.java)

        } else {
            Intent (this,MainActivity:: class.java)

        }

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(activityIntent)
            finish()
        }, 1000)


    }
}