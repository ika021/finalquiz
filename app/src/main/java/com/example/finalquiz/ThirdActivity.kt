package com.example.finalquiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import com.bumptech.glide.Glide


class ThirdActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var qOne: TextView
    private lateinit var qTwo: TextView
    private lateinit var qThree: TextView
    private lateinit var qFour: TextView
    private lateinit var btn_submit: Button
    private lateinit var questionText: TextView
    private lateinit var tv_progress: TextView
    private lateinit var progressBar: ProgressBar
    private lateinit var qImage: ImageView

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Questions>? = null

    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0


    private var mUserName: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        qOne = findViewById(R.id.qOne)
        qTwo = findViewById(R.id.qTwo)
        qThree = findViewById(R.id.qThree)
        qFour = findViewById(R.id.qFour)
        btn_submit = findViewById(R.id.btn_submit)
        tv_progress = findViewById(R.id.tv_progress)
        progressBar = findViewById(R.id.progressBar)
        questionText = findViewById(R.id.questionText)
        qImage = findViewById(R.id.qImage)



        mUserName = intent.getStringExtra(QuestionObject.USER_NAME)

        mQuestionsList = QuestionObject.getQuestionsForHard()

        setQuestion()

        qOne.setOnClickListener(this)
        qTwo.setOnClickListener(this)
        qThree.setOnClickListener(this)
        qFour.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.qOne -> {

                selectedOptionView(qOne, 1)
            }

            R.id.qTwo -> {

                selectedOptionView(qTwo, 2)
            }

            R.id.qThree -> {

                selectedOptionView(qThree, 3)
            }

            R.id.qFour -> {

                selectedOptionView(qFour, 4)
            }

            R.id.btn_submit -> {

                if (mSelectedOptionPosition == 0) {

                    mCurrentPosition++

                    when {

                        mCurrentPosition <= mQuestionsList!!.size -> {

                            setQuestion()
                        }
                        else -> {



                            val intent =
                                Intent(this@ThirdActivity, ResultActivity::class.java)
                            intent.putExtra(QuestionObject.USER_NAME, mUserName)
                            intent.putExtra(QuestionObject.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(QuestionObject.TOTAL_QUESTIONS, mQuestionsList!!.size)
                            startActivity(intent)
                            finish()

                        }
                    }
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)

                    if(question!!.correctAnswer != mSelectedOptionPosition) {

                    }
                    else {
                        mCorrectAnswers++
                    }



                    if (mCurrentPosition == mQuestionsList!!.size) {
                        btn_submit.text = "Done"
                    } else {
                        btn_submit.text = "Next Question"
                    }

                    mSelectedOptionPosition = 0
                }
            }
        }
    }


    private fun setQuestion() {

        val question = mQuestionsList!!.get(mCurrentPosition - 1)

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size) {
            btn_submit.text = "FINISH"
        } else {
            btn_submit.text = "SUBMIT"
        }

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + "5"

        questionText.text = question.question

        qOne.text = question.one
        qTwo.text = question.two
        qThree.text = question.three
        qFour.text = question.four
        Glide.with(qImage.context)
            .load(question.image)
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(qImage)
    }


    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(
            Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)

    }


    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        options.add(0, qOne)
        options.add(1, qTwo)
        options.add(2, qThree)
        options.add(3, qFour)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT

        }
    }}