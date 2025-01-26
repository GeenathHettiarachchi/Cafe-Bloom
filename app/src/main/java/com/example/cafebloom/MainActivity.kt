package com.example.cafebloom

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.HorizontalScrollView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    fun nextScreen(view: View?) {
//        val goToNextScreen = Intent(applicationContext, MenuActivity::class.java)
//        startActivity(goToNextScreen)
//    }
}