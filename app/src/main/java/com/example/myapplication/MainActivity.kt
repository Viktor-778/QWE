package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
        }
        var button2 = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
        }
        var button3 = findViewById<Button>(R.id.button3)
        button.setOnClickListener {
        }
        var button4 = findViewById<Button>(R.id.button5)
        button.setOnClickListener {
        }
        var result1 = findViewById<TextView>(R.id.RESULT)
        var result2 = findViewById<TextView>(R.id.textView)
    }
}