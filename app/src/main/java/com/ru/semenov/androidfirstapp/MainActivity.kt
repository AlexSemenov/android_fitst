package com.ru.semenov.androidfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainButton: Button = findViewById(R.id.mainButton)
        mainButton.setOnClickListener {
            Log.i("@!main_btn", "Hello this is \"Main button\"")
        }

        val secondaryLeft: Button = findViewById(R.id.secondaryLeft)
        secondaryLeft.setOnClickListener {
            Log.i("@!secondary_btn", "Hello this is \"Secondary left button\"")
        }

        val secondaryRight: Button = findViewById(R.id.secondaryRight)
        secondaryRight.setOnClickListener {
            Log.i("@!secondary_btn", "Hello this is \"Secondary right button\"")
        }
    }
}