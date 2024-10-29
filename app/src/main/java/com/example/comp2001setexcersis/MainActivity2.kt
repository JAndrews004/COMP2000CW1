package com.example.comp2001setexcersis

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val LogOutButton: Button = findViewById (R.id.logOut)
        LogOutButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java )
            startActivity(intent)
        }

        val detailsButton: Button = findViewById (R.id.viewEdit)
        detailsButton.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java )
            startActivity(intent)
        }

        val requestButton: Button = findViewById (R.id.Request)
        requestButton.setOnClickListener{
            val intent = Intent(this, MainActivity4::class.java )
            startActivity(intent)
        }

        val viewButton: Button = findViewById (R.id.view)
        viewButton.setOnClickListener{
            val intent = Intent(this, MainActivity5::class.java )
            startActivity(intent)
        }

        val cancelButton: Button = findViewById (R.id.cancel)
        cancelButton.setOnClickListener{
            val intent = Intent(this, MainActivity6::class.java )
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}