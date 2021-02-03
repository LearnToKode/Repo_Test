package com.example.myfirstgithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val blueButton: Button = findViewById(R.id.myButton)
        blueButton.setOnClickListener{
            // myy funcionality

            Toast.makeText(this, "Esto es un mensaje", Toast.LENGTH_SHORT.show()


            )
        }
    }



}