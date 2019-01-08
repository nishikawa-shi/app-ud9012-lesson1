package com.ntetz.android.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = this.findViewById(R.id.roll_button)
        rollButton.text = this.getString(R.string.roll_button_default)
        rollButton.setOnClickListener {
            this.rollDice()
        }
    }

    private fun rollDice() {
        val offset = 1
        val range = 6
        val randomInt = Random().nextInt(range) + offset
        val resultText: TextView = this.findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }
}
