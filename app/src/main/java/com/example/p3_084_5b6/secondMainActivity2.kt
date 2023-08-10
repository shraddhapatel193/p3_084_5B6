package com.example.p3_084_5b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextClock

class SecondMainActivity2 : AppCompatActivity() {
     lateinit var Text_Header:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_main2)


        val intent = intent
        var bundle:String? = intent.getStringExtra("MainActivity1")
        findViewById(R.id.text2)
        Text_Header.text = bundle

      // var Button_main = findViewById<Button>(R.id.Button_main)
      // var Send_text = findViewById<EditText>(R.id.Send_text)

    }


//    fun SecondActivitycall(view: View) {
//        //  val secondManiActivity2 = intent
//     //   var secondManiActivity2 = null
//        var secondManiActivity2 = null
//        intent= Intent(this,secondManiActivity2)

  //  }

}