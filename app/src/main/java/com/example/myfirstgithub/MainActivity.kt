package com.example.myfirstgithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val blueButton: Button = findViewById(R.id.myButton)
        blueButton.setOnClickListener{
            // myy funcionality

        }
    }



}