package com.falen.tooodoolist

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profil)
        val imageRegister = findViewById<ImageView>(R.id.imageView11)
// Set OnClickListener untuk berpindah ke Register Screen
        imageRegister.setOnClickListener { // Intent untuk berpindah ke RegisterActivity
            val intent: Intent = Intent(
                this@profil,
                home::class.java
            )
            startActivity(intent)
        }
        val imageRegister1 = findViewById<ImageView>(R.id.imageView15)
// Set OnClickListener untuk berpindah ke Register Screen
        imageRegister1.setOnClickListener { // Intent untuk berpindah ke RegisterActivity
            val intent: Intent = Intent(
                this@profil,
                editprofil::class.java
            )
            startActivity(intent)
        }
        val imageRegister2 = findViewById<ImageView>(R.id.imageView17)
// Set OnClickListener untuk berpindah ke Register Screen
        imageRegister2.setOnClickListener { // Intent untuk berpindah ke RegisterActivity
            val intent: Intent = Intent(
                this@profil,
                SignIn::class.java
            )
            startActivity(intent)
        }
    }
}