package com.example.projektmatecki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val next = findViewById<Button>(R.id.button)
    val previous = findViewById<Button>(R.id.button2)
        val obraz1 = findViewById<ImageView>(R.id.imageView2).setImageResource(R.drawable.oraz1)
        val obraz2 = findViewById<ImageView>(R.id.imageView2).setImageResource(R.drawable.obraz2)
        val obraz3 = findViewById<ImageView>(R.id.imageView2).setImageResource(R.drawable.obraz3)
        val obraz4 = findViewById<ImageView>(R.id.imageView2).setImageResource(R.drawable.obraz4)



    }
}