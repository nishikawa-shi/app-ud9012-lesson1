package com.ntetz.android.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = this.findViewById(R.id.roll_button)
        rollButton.text = this.getString(R.string.roll_button_default)
        rollButton.setOnClickListener {
        }
    }
}
