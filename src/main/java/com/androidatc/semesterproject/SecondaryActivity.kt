package com.androidatc.semesterproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_secondary.*

class SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        ListTitle.text = intent.getStringExtra("ListTitle")
        WeightOne.text = intent.getStringExtra("WeightOne")
        WeightTwo.text = intent.getStringExtra("WeightTwo")
        WeightThree.text = intent.getStringExtra("WeightThree")
        WeightFour.text = intent.getStringExtra("WeightFour")
        WeightFive.text = intent.getStringExtra("WeightFive")
    }
    fun GoToMainActivity(view: View) {
        var intent = Intent(this, MainActivity::class.java)
        intent.putExtra("TaskOne",TaskOne.text.toString())
        intent.putExtra("TaskTwo",TaskTwo.text.toString())
        intent.putExtra("TaskThree",TaskThree.text.toString())
        intent.putExtra("TaskFour",TaskFour.text.toString())
        intent.putExtra("TaskFive",TaskFive.text.toString())
        startActivity(intent)
    }
    fun GoToHelpActivity(view: View) {
        var intent = Intent(this,help::class.java)
        startActivity(intent)
    }
    fun GoToPreferencesActivity(view: View) {
        var intent = Intent(this,preferences::class.java)
        intent.putExtra("TaskOne",TaskOne.text.toString())
        intent.putExtra("TaskTwo",TaskTwo.text.toString())
        intent.putExtra("TaskThree",TaskThree.text.toString())
        intent.putExtra("TaskFour",TaskFour.text.toString())
        intent.putExtra("TaskFive",TaskFive.text.toString())
        startActivity(intent)
    }
}