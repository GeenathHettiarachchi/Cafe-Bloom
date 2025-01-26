package com.example.cafebloom

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signup = findViewById<TextView>(R.id.sign_up)
        signup.setOnClickListener {
            val goToSignUp = Intent(applicationContext, SignupActivity::class.java)
            startActivity(goToSignUp)
        }

        val forget = findViewById<TextView>(R.id.forgot_password)
        forget.setOnClickListener {
            val goToForget = Intent(applicationContext, SignupActivity::class.java)
            startActivity(goToForget)
        }
    }
}