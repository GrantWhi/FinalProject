package com.androidatc.semesterproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class help : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
    }
    fun GoToMainActivity(view: View) {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun GoToSecondaryActivity(view: View) {
        var intent = Intent(this,SecondaryActivity::class.java)
        startActivity(intent)
    }
    fun GoToPreferencesActivity(view: View) {
        var intent = Intent(this,preferences::class.java)
        startActivity(intent)
    }
}