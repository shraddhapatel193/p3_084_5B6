package com.example.p3_084_5b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SecondMainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_main2)
    }
    fun SecondActivitycall(view: View) {
        //  val secondManiActivity2 = intent
     //   var secondManiActivity2 = null
        var secondManiActivity2 = null
        intent= Intent(this,secondManiActivity2)

    }

}