package com.example.finalquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class ForgotActivity : AppCompatActivity() {
    private lateinit var forgotEmailPass: TextView
    private lateinit var sendButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)

        init()

        registerListeners()
    }
    private fun init(){

        forgotEmailPass = findViewById(R.id.forgotEmailPass)

        sendButton = findViewById(R.id.sendButton)

    }

    private fun registerListeners(){

        sendButton.setOnClickListener {

            val email = forgotEmailPass.text.toString()

            if ( email.isEmpty()){
                Toast.makeText(this, "Please, Enter an Email address!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            FirebaseAuth.getInstance().sendPasswordResetEmail(email).addOnCompleteListener {
                    task ->
                if (task.isSuccessful){
                    Toast.makeText(this, "Password recovery link Has been sent!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "User not found!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}