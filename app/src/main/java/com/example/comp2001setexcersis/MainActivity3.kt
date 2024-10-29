package com.example.comp2001setexcersis

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val LogOutButton: Button = findViewById (R.id.logOut)
        LogOutButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java )
            startActivity(intent)
        }
        val homeButton: Button = findViewById (R.id.home)
        homeButton.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java )
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}