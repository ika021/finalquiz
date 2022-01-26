package com.example.finalquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var loginEmail:EditText
    private lateinit var loginPassword:EditText
    private lateinit var register: Button
    private lateinit var login: Button
    private lateinit var forgPass: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        init()

        registerListeners()

    }

    private fun init(){
        loginEmail = findViewById(R.id.loginEmail)
        loginPassword = findViewById(R.id.loginPassword)
        register = findViewById(R.id.register)
        login = findViewById(R.id.login)
        forgPass = findViewById(R.id.forgPass)

    }
    private fun registerListeners() {
        register.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        forgPass.setOnClickListener{
            startActivity(Intent(this, ForgotActivity::class.java))
        }

        login.setOnClickListener {
            val email = loginEmail.text.toString()
            val password = loginPassword.text.toString()

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Empty~!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            FirebaseAuth.getInstance()
                .signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful){
                        gotoProfile()
                    } else {
                        Toast.makeText(this,"Error!",Toast.LENGTH_SHORT).show()
                    }
                }
        }

    }
    private fun gotoProfile(){
        startActivity(Intent(this, MainActivity::class.java))
        finish()

    }
}