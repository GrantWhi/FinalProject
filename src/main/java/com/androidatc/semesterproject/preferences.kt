package com.androidatc.semesterproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_preferences.*
import kotlinx.android.synthetic.main.activity_secondary.*
import kotlinx.android.synthetic.main.activity_secondary.ListTitle
import kotlinx.android.synthetic.main.activity_secondary.TaskFive
import kotlinx.android.synthetic.main.activity_secondary.TaskFour
import kotlinx.android.synthetic.main.activity_secondary.TaskOne
import kotlinx.android.synthetic.main.activity_secondary.TaskThree
import kotlinx.android.synthetic.main.activity_secondary.TaskTwo

class preferences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)
        ListTitle.text = intent.getStringExtra("ListTitle")
        Task1.text = intent.getStringExtra("TaskOne")
        Task2.text = intent.getStringExtra("TaskTwo")
        Task3.text = intent.getStringExtra("TaskThree")
        Task4.text = intent.getStringExtra("TaskFour")
        Task5.text = intent.getStringExtra("TaskFive")
    }
    fun GoToMainActivity(view: View) {
        var intent = Intent(this, MainActivity::class.java)
        intent.putExtra("WeightOne", Weight1.text.toString())
        intent.putExtra("WeightTwo", Weight2.text.toString())
        intent.putExtra("WeightThree", Weight3.text.toString())
        intent.putExtra("WeightFour", Weight4.text.toString())
        intent.putExtra("WeightFive", Weight5.text.toString())
        startActivity(intent)
    }
    fun GoToSecondaryActivity(view: View) {
        var intent = Intent(this,SecondaryActivity::class.java)
        intent.putExtra("WeightOne", Weight1.text.toString())
        intent.putExtra("WeightTwo", Weight2.text.toString())
        intent.putExtra("WeightThree", Weight3.text.toString())
        intent.putExtra("WeightFour", Weight4.text.toString())
        intent.putExtra("WeightFive", Weight5.text.toString())
        startActivity(intent)
    }
    fun GoToHelpActivity(view: View) {
        var intent = Intent(this,help::class.java)
        startActivity(intent)
    }
}