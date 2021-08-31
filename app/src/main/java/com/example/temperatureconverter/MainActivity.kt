package com.example.temperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var display : EditText
    lateinit var Fdisplay : TextView
    lateinit var Kdisplay : TextView
    lateinit var convert : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        convert = findViewById(R.id.convert)
    }
    fun tempCon(view: View){
        display = findViewById(R.id.input)
        Fdisplay = findViewById(R.id.Fdisplay)
        Kdisplay = findViewById(R.id.Kdisplay)
        var temp  = display.getText().toString()
        var F = ((temp.toDouble() * 1.8) + 32).toDouble()
        var k =((temp.toDouble()) + 273.15)
        Kdisplay.setText("%.2f".format(k).toString())
        //Fdisplay.setText(F.toString())
        Fdisplay.setText("%.2f".format(F).toString())
    }
}