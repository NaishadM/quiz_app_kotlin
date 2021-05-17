package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var tv=findViewById(R.id.tv_rating) as TextView
        var rb=findViewById(R.id.rating) as RatingBar

        rb.setOnRatingBarChangeListener { ratingBar, rating, fromUser -> tv.text="Rating is "+rating }

        val tv_name  =findViewById(R.id.tv_name) as TextView
        val tv_score=findViewById(R.id.tv_score) as TextView
        val btnfinish=findViewById(R.id.btnfinish) as Button
        val username=intent.getStringExtra(Constants.USER)
        tv_name.text= username.toString()

        val totalQuestions=intent.getIntExtra(Constants.Total,0)
        val correctAnswers=intent.getIntExtra(Constants.Correct,0)
        tv_score.text="your Score is $correctAnswers out of $totalQuestions"

        btnfinish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }


    }
}