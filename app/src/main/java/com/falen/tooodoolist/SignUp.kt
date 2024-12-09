package com.falen.tooodoolist

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)
        val textRegister = findViewById<TextView>(R.id.textViewSignUp)
// Set OnClickListener untuk berpindah ke Register Screen
        textRegister.setOnClickListener { // Intent untuk berpindah ke RegisterActivity
            val intent: Intent = Intent(
                this@SignUp,
                SignIn::class.java
            )
            startActivity(intent)
        }
        val imageRegister = findViewById<ImageView>(R.id.imageView5)
// Set OnClickListener untuk berpindah ke Register Screen
        imageRegister.setOnClickListener { // Intent untuk berpindah ke RegisterActivity
            val intent: Intent = Intent(
                this@SignUp,
                home::class.java
            )
            startActivity(intent)
        }
    }
}