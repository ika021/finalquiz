package com.example.finalquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private lateinit var tv_name: TextView
    private lateinit var tv_score:TextView
    private lateinit var tv_congratulations:TextView
    private lateinit var btn_finish: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        tv_name = findViewById(R.id.tv_name)
        tv_score = findViewById(R.id.tv_score)
        btn_finish = findViewById(R.id.btn_finish)
        tv_congratulations = findViewById(R.id.tv_congratulations)


        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(QuestionObject.USER_NAME)
        tv_name.text = userName

        val totalQuestions = intent.getIntExtra(QuestionObject.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(QuestionObject.CORRECT_ANSWERS, 0)

        if(correctAnswers >= 3){
            tv_congratulations.text = "Congrats"
            tv_score.text = "You Got $correctAnswers Out of 5"
        }
        if(correctAnswers < 3){
            tv_congratulations.text = "F"
            tv_score.text = "You Got $correctAnswers Out of 5"
        }


        btn_finish.setOnClickListener {
            startActivity(Intent(this@ResultActivity, MainActivity::class.java))
        }

    }
}