package com.falen.tooodoolist

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Handler().postDelayed(Runnable {
            val intent = Intent(
                this@MainActivity,
                SignIn::class.java
            )
            startActivity(intent)
            finish() // Mengakhiri Splash Screen 1
        }, 3000)
    }
}