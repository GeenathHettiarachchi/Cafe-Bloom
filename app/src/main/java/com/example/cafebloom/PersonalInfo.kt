package com.example.cafebloom

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class PersonalInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_info)

        // Find views
        val editProfileButton = findViewById<Button>(R.id.editProfileButton)
        val backArrow = findViewById<ImageView>(R.id.backArrow)

        // Navigate to Edit Profile Page
        editProfileButton.setOnClickListener {
            val intent = Intent(this,EditProfile::class.java) // Replace with your Edit Profile Activity
            startActivity(intent)
        }

        // Go back to the previous page
        backArrow.setOnClickListener {
            finish() // Ends the current activity and returns to the previous one
        }
    }
}