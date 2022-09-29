package com.example.constrainlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switch : Switch = findViewById(R.id.switch2)
        val imagen : ImageView = findViewById(R.id.imageView)

        var bol = true
        switch.setOnClickListener { view ->
            if (bol) {
                imagen.setImageDrawable(getDrawable(R.drawable.messi))
                bol = false
            } else {
                imagen.setImageDrawable(null)
                bol = true
            }
        }
    }
}