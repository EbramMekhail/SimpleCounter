package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<ImageButton>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        var counter = 0
        var upgradeButton = findViewById<Button>(R.id.upgradeButton)
        var addBy = 1
        var first = true
        var cost = 100
        button.setOnClickListener {
            counter+=addBy
            textView.text = counter.toString()
            if (counter >= cost){
                upgradeButton.visibility = View.VISIBLE
                upgradeButton.text = "Upgrade to add " + (addBy+1)
                upgradeButton.setOnClickListener{
                    cost +=100
//                    first = false
                    addBy+=1
//                    button.text = "Add $addBy"
                    upgradeButton.visibility = View.INVISIBLE

                }
            }
        }
    }
}