package edu.uw.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnPushMe : Button
    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPushMe = findViewById(R.id.btnPushMe)
        number = 0
        btnPushMe.setOnClickListener {
            displayText()
        }
    }

    fun displayText() {
        number = number + 1
        if (number == 1) {
            btnPushMe.setText(getString(R.string.single_time_text, number.toString()))
        } else {
            btnPushMe.setText(getString(R.string.multiple_time_text, number.toString()))
        }
    }
}