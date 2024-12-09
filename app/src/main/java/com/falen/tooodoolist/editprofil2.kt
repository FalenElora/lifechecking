package com.falen.tooodoolist

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class editprofil2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_editprofil2)
        val imageRegister = findViewById<ImageView>(R.id.imageView22)
// Set OnClickListener untuk berpindah ke Register Screen
        imageRegister.setOnClickListener { // Intent untuk berpindah ke RegisterActivity
            val intent: Intent = Intent(
                this@editprofil2,
                editprofil::class.java
            )
            startActivity(intent)
        }
        val imageRegister1 = findViewById<ImageView>(R.id.imageView26)
// Set OnClickListener untuk berpindah ke Register Screen
        imageRegister1.setOnClickListener { // Intent untuk berpindah ke RegisterActivity
            val intent: Intent = Intent(
                this@editprofil2,
                profil::class.java
            )
            startActivity(intent)
        }
    }
}