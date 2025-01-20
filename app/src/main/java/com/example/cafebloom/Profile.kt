package com.example.cafebloom

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.LinearLayout

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Find views
        val profilePicture = findViewById<ImageView>(R.id.profile_Pic) // Match your XML
        val personalInfo = findViewById<LinearLayout>(R.id.personal_info) // Match your XML

        // Navigate to Profile Information Page when profile picture is clicked
        profilePicture.setOnClickListener {
            val intent = Intent(this, PersonalInfo::class.java)
            startActivity(intent)
        }

        // Navigate to Profile Information Page when personal_info is clicked
        personalInfo.setOnClickListener {
            val intent = Intent(this, PersonalInfo::class.java)
            startActivity(intent)
        }
    }
}


