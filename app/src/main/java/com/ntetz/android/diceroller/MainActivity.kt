package com.ntetz.android.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        val diceImage: ImageView = this.findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> return
        }
        diceImage.setImageResource(drawableResource)
    }
}
