package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null
    private var numTimes = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val button = findViewById<Button>(R.id.button2)
        textView = findViewById<TextView>(R.id.textView)
        textView?.movementMethod = ScrollingMovementMethod()

        button.setOnClickListener {
            numTimes+=1
            if(numTimes != 1) {
                textView?.append("\n")
            }
            textView?.append("${editText?.text} has tapped the button $numTimes times!")

        }
    }
}