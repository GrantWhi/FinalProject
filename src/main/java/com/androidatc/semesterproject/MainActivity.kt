package com.androidatc.semesterproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_help.*
import kotlinx.android.synthetic.main.activity_help.ListTitle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.TaskFive
import kotlinx.android.synthetic.main.activity_main.TaskFour
import kotlinx.android.synthetic.main.activity_main.TaskOne
import kotlinx.android.synthetic.main.activity_main.TaskThree
import kotlinx.android.synthetic.main.activity_main.TaskTwo
import kotlinx.android.synthetic.main.activity_secondary.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TaskOne.text = intent.getStringExtra("TaskOne")
        TaskTwo.text = intent.getStringExtra("TaskTwo")
        TaskThree.text = intent.getStringExtra("TaskThree")
        TaskFour.text = intent.getStringExtra("TaskFour")
        TaskFive.text = intent.getStringExtra("TaskFive")
        TaskOneCompletion.text = intent.getStringExtra("WeightOne")
        TaskTwoCompletion.text = intent.getStringExtra("WeightTwo")
        TaskThreeCompletion.text = intent.getStringExtra("WeightThree")
        TaskFourCompletion.text = intent.getStringExtra("WeightFour")
        TaskFiveCompletion.text = intent.getStringExtra("WeightFive")
    }

    fun GoToSecondaryActivity(view: View) {
        var intent = Intent(this, SecondaryActivity::class.java)
        intent.putExtra("ListTitle", ListTitle.text.toString())
        startActivity(intent)
    }

    fun GoToHelpActivity(view: View) {
        var intent = Intent(this, help::class.java)
        startActivity(intent)
    }

    fun GoToPreferencesActivity(view: View) {
        var intent = Intent(this, preferences::class.java)
        intent.putExtra("ListTitle", ListTitle.text.toString())
        startActivity(intent)
    }

}