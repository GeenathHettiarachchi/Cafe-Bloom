package com.example.cafebloom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.widget.Button
import android.widget.HorizontalScrollView
import android.widget.LinearLayout
import android.widget.ScrollView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_orders)


        val scrollButton = findViewById<Button>(R.id.processing)
        val horizontalScrollView = findViewById<HorizontalScrollView>(R.id.horizontalScrollView)

        scrollButton.setOnClickListener {
            // Scroll right by 200 pixels
            horizontalScrollView.smoothScrollBy(200, 0)
        }
    }
}