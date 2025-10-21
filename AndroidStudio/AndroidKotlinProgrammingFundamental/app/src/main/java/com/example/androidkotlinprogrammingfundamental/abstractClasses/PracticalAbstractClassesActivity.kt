package com.example.androidkotlinprogrammingfundamental.abstractClasses

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidkotlinprogrammingfundamental.R

class PracticalAbstractClassesActivity : AppCompatActivity() {

    lateinit var loginButton: Button
    lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_abstract_classes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        loginButton = findViewById<Button>(R.id.loginButton)
        registerButton = findViewById<Button>(R.id.registerButton)

        loginButton.setOnClickListener {
            println("Login Button Clicked")
            Toast.makeText(this, "Login Button Clicked", Toast.LENGTH_SHORT).show()
        }

        registerButton.setOnClickListener {
            println("Register Button Clicked")
            Toast.makeText(this, "Register Button Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}