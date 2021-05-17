package com.example.quizapp

import Constants.Correct
import Constants.Total
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import org.w3c.dom.Text

class Quizquestions : AppCompatActivity(), View.OnClickListener{

    private var mcurrentPosition:Int=1
    private var mQuestionList: ArrayList<Question>?=null
    private var mselectOptionPosition: Int =0
    private var mccorrectAnswers: Int =0
    private var mUSER:String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizquestions)

        mUSER=intent.getStringExtra(Constants.USER)

        mQuestionList = Constants.getQuestions()

        setQuestion()
        val  tv_option_one =findViewById(R.id.tv_option_one) as TextView
        val  tv_option_two =findViewById(R.id.tv_option_two) as TextView
        val  tv_option_three =findViewById(R.id.tv_option_three) as TextView
        val  tv_option_four =findViewById(R.id.tv_option_four) as TextView
        val btn_submit =findViewById(R.id.btn_submit) as Button
        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)

    }
        private fun setQuestion(){



        val question=mQuestionList!![mcurrentPosition-1]

            defaultOptionsView()
            val btn_submit =findViewById(R.id.btn_submit) as Button
        if(mcurrentPosition==mQuestionList!!.size){

            btn_submit.text="Finish"

        }else{
            btn_submit.text="Submit"
        }
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)

        progressBar.progress=mcurrentPosition
            val t2 = findViewById(R.id.tv_progress) as TextView
        t2.text ="$mcurrentPosition"+"/"+progressBar.max

        val tv_question = findViewById(R.id.tv_question) as TextView
        tv_question.text=question!!.question



        val iv_image = findViewById<ImageView>(R.id.iv_image)
        iv_image.setImageResource(question.image)

        val  tv_option_one =findViewById(R.id.tv_option_one) as TextView
        val  tv_option_two =findViewById(R.id.tv_option_two) as TextView
        val  tv_option_three =findViewById(R.id.tv_option_three) as TextView
        val  tv_option_four =findViewById(R.id.tv_option_four) as TextView

        tv_option_one.text=question.optionOne
        tv_option_two.text=question.optionTwo
        tv_option_three.text=question.optionThree
        tv_option_four.text=question.optionFour






    }

    private fun defaultOptionsView(){
        val  tv_option_one =findViewById(R.id.tv_option_one) as TextView
        val  tv_option_two =findViewById(R.id.tv_option_two) as TextView
        val  tv_option_three =findViewById(R.id.tv_option_three) as TextView
        val  tv_option_four =findViewById(R.id.tv_option_four) as TextView
        val options= ArrayList<TextView>()
        options.add(0,tv_option_one)
        options.add(1,tv_option_two)
        options.add(2,tv_option_three)
        options.add(3,tv_option_four)


        for (option in options){
            option.setTextColor(Color.parseColor("#626466"))
            option.typeface= Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(
                    this,
                    R.drawable.default_option_border_bg

            )


        }
    }

    override fun onClick(v: View?) {
        when(v?.id){

            R.id.tv_option_one -> {
                val tv_option_one  =findViewById(R.id.tv_option_one) as TextView
                selectedOptionView(tv_option_one, 1)
            }
            R.id.tv_option_two->{
                val  tv_option_two =findViewById(R.id.tv_option_two) as TextView
                selectedOptionView(tv_option_two,2)
            }
            R.id.tv_option_three->{
                val  tv_option_three =findViewById(R.id.tv_option_three) as TextView
                selectedOptionView(tv_option_three,3)
            }
            R.id.tv_option_four->{
                val  tv_option_four =findViewById(R.id.tv_option_four) as TextView
                selectedOptionView(tv_option_four,4)
            }
            R.id.btn_submit->{
                if(mselectOptionPosition==0){
                    mcurrentPosition++
                    when{
                        mcurrentPosition<= mQuestionList!!.size->{
                            setQuestion()
                        }else->{

                        val intent= Intent(this,result::class.java)
                        intent.putExtra(Constants.USER,mUSER)
                        intent.putExtra(Correct,mccorrectAnswers)
                        intent.putExtra(Total,mQuestionList!!.size)
                        startActivity(intent)

                        Toast.makeText(this,"you have successfully completed the quiz",Toast.LENGTH_SHORT).show()
                        }
                    }
                }else{
                    val question =mQuestionList?.get(mcurrentPosition-1)

                    if(question!!.correctAns!=mselectOptionPosition){
                        answerView(mselectOptionPosition,R.drawable.wrong_option_border_bg)
                    }else
                    {
                        mccorrectAnswers++
                    }
                    answerView(question.correctAns, R.drawable.correct_option_border_bg )
                    val btn_submit =findViewById(R.id.btn_submit) as Button
                    if(mcurrentPosition==mQuestionList!!.size){
                        btn_submit.text="Finish"
                    }else{
                        btn_submit.text=" Next Question"
                    }
                    mselectOptionPosition=0
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){




            1->{
                val  tv_option_one =findViewById(R.id.tv_option_one) as TextView
                tv_option_one.background=ContextCompat.getDrawable(this,drawableView)
            }

            2->{
                val  tv_option_two =findViewById(R.id.tv_option_two) as TextView
                tv_option_two.background=ContextCompat.getDrawable(this,drawableView)
            }

            3->{
                val  tv_option_three =findViewById(R.id.tv_option_three) as TextView
                tv_option_three.background=ContextCompat.getDrawable(this,drawableView)
            }

            4->{
                val  tv_option_four =findViewById(R.id.tv_option_four) as TextView
                tv_option_four.background=ContextCompat.getDrawable(this,drawableView)
            }
        }

    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
    defaultOptionsView()
    mselectOptionPosition=selectedOptionNum
        tv.setTextColor(Color.parseColor("#8E24AA"))
        tv.setTypeface(tv.typeface, Typeface.BOLD_ITALIC)
        tv.background=ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
        )
    }


}

