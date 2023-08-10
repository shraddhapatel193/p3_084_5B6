package com.example.p3_084_5b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val tag="MainActivity"
    lateinit var Message_Edit_text:EditText
    val EXTRA_MESSAGE = "com.example.p3_084_5b6.message"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Message_Edit_text = findViewById(R.id.edit_text)
    }

    fun SecondActivitycall(view: View) {
        Log.i(tag," is called")

        intent = Intent(this,SecondMainActivity2::class.java)

        var message = Message_Edit_text.toString()
        intent.putExtra("MainActivity1",EXTRA_MESSAGE)
        startActivity(intent)

    }
}