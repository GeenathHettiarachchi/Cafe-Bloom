package com.example.coffeproducts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CokeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coke)
        // Optionally set a custom toolbar or action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // Explicit method to handle back button navigation
    fun goBack(view: View?) {
        finish() // This closes the current activity and goes to the previous one
    }

    // Override hardware back button for additional control
    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
    fun shakepage (view: View?){
        val shakePage = Intent(applicationContext,ShakeActivity:: class.java)
        startActivity(shakePage)
    }
    fun hotcoffeepage (view: View?){
        val hotcoffeePage = Intent(applicationContext,HotCoffeeActivity:: class.java)
        startActivity(hotcoffeePage)
    }
    fun icedcoffeepage (view: View?){
        val icedcoffeePage = Intent(applicationContext,IcedCoffeeActivity:: class.java)
        startActivity(icedcoffeePage)
    }
    fun hotdrinkspage (view: View?){
        val hotdrinksPage = Intent(applicationContext,HotDrinksActivity:: class.java)
        startActivity(hotdrinksPage)
    }
    fun breakfastpage (view: View?){
        val breakfastPage = Intent(applicationContext,BreakfastActivity:: class.java)
        startActivity(breakfastPage)
    }
    fun cokepage (view: View?){
        val cokePage = Intent(applicationContext,CokeActivity:: class.java)
        startActivity(cokePage)
    }
    fun brewingcoffeepage (view: View?){
        val brewingcoffeePage = Intent(applicationContext,BrewingCoffeeActivity:: class.java)
        startActivity(brewingcoffeePage)
    }
}