package com.taingy.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.btn_add)
        val btnSub = findViewById<Button>(R.id.btn_subtract)
        val btnMultiply = findViewById<Button>(R.id.btn_multiply)
        val btnDivide = findViewById<Button>(R.id.btn_divide)
        val btnClear = findViewById<Button>(R.id.btn_clear)
        val input1 = findViewById<EditText>(R.id.et_input_1)
        val input2 = findViewById<EditText>(R.id.et_input_2)
        val result = findViewById<TextView>(R.id.tv_result)

        btnAdd.setOnClickListener {
            result.text = (input1.text.toString().toDouble().plus(input2.text.toString().toDouble())).toString()
        }

        btnSub.setOnClickListener {
            result.text = (input1.text.toString().toDouble().minus(input2.text.toString().toDouble())).toString()
        }

        btnMultiply.setOnClickListener {
            result.text = (input1.text.toString().toDouble().times(input2.text.toString().toDouble())).toString()
        }

        btnDivide.setOnClickListener {
            result.text = (input1.text.toString().toDouble().div(input2.text.toString().toDouble())).toString()
        }

        btnClear.setOnClickListener {
            result.text = ""
            input1.text.clear()
            input2.text.clear()
        }
    }
}