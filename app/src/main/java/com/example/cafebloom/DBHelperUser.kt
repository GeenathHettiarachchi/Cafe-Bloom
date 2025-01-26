package com.example.cafebloom

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.HorizontalScrollView


class DBHelperUser(context: Context) : SQLiteOpenHelper(context, "CafeBloom", null, 1) {
    companion object {
        const val TABLE_NAME = "User"
        private const val SQL_CREATE_ENTRIES = "CREATE TABLE $TABLE_NAME (id INTEGER PRIMARY KEY AUTOINCREMENT, UserName TEXT, Email TEXT, PhoneNumber TEXT, Password TEXT)"
        private const val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS $TABLE_NAME"
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_ENTRIES)
    }

    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {
        db.execSQL(SQL_DELETE_ENTRIES)
        onCreate(db)
    }

    fun insertUser(username: String, email: String, phone: String, password: String) {
        val values = ContentValues()
        values.put("UserName", username)
        values.put("Email", email)
        values.put("PhoneNumber", phone)
        values.put("Password", password)
        val db = this.writableDatabase
        db.insert(TABLE_NAME, null, values)
        db.close()
    }
}