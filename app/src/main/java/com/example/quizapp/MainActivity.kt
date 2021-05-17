package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val b1 = findViewById(R.id.btnstart) as Button
        val t1 = findViewById(R.id.et_name) as TextView
        b1.setOnClickListener{
            if(t1.text.toString().isEmpty()){
                Toast.makeText(this, "Please enter your Name",Toast.LENGTH_SHORT).show()
            }
            else
            {
                val intent= Intent(this, Quizquestions::class.java)
                intent.putExtra(Constants.USER,t1.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}