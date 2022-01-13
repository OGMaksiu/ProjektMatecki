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

        var x = 1
        findViewById<ImageView>(R.id.imageView2).setImageResource(R.drawable.ic_launcher_background)

        next.setOnClickListener{
            if(x==1){
                findViewById<ImageView>(R.id.imageView2).setImageResource(R.drawable.oraz1)
                x++
        }
            else if(x==2){
                findViewById<ImageView>(R.id.imageView2).setImageResource(R.drawable.obraz2)
                x++
            }
            else if(x==3){
                findViewById<ImageView>(R.id.imageView2).setImageResource(R.drawable.obraz3)
                x++
            }
            else if(x==4){
                findViewById<ImageView>(R.id.imageView2).setImageResource(R.drawable.obraz4)
                x = 1
            }
        }
        previous.setOnClickListener{
            x--
            if(x==-1|| x==0){
                findViewById<ImageView>(R.id)
            }
        }


    }
}