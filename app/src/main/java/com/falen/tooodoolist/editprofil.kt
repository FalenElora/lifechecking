package com.falen.tooodoolist

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class editprofil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_editprofil)
        val imageRegister = findViewById<ImageView>(R.id.imageView19)
// Set OnClickListener untuk berpindah ke Register Screen
        imageRegister.setOnClickListener { // Intent untuk berpindah ke RegisterActivity
            val intent: Intent = Intent(
                this@editprofil,
                profil::class.java
            )
            startActivity(intent)
        }
        val imageRegister1 = findViewById<ImageView>(R.id.imageView21)
// Set OnClickListener untuk berpindah ke Register Screen
        imageRegister1.setOnClickListener { // Intent untuk berpindah ke RegisterActivity
            val intent: Intent = Intent(
                this@editprofil,
                editprofil2::class.java
            )
            startActivity(intent)
        }
    }
}