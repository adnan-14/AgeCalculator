package com.example.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvAge.setText("");

    }
    public fun calculateAge(view: View){
        val dob: String = eTBirth.text.toString()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val age = currentYear - dob.toInt()
        tvAge.setText("Your age is $age")
    }
}
