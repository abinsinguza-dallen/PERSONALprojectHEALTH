package com.dallen.doctorsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class loginActivity : AppCompatActivity() {
    lateinit var btnlogin:Button
    lateinit var tilusername:TextInputLayout
    lateinit var etusername:TextInputEditText
    lateinit var tilEmail:TextInputLayout
    lateinit var etEmail:TextInputEditText
    lateinit var tilpassiword:TextInputLayout
    lateinit var etpassiword:TextInputEditText
    lateinit var btncreateacount:Button
    lateinit var tvforgot:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
        tvforgot = findViewById(R.id.tvForgot)
        tilusername = findViewById(R.id.tilusername)
        etusername = findViewById(R.id.etusername)
        btnlogin = findViewById(R.id.btnlogin)
        tilEmail = findViewById(R.id.tilEmail)
        etEmail = findViewById(R.id.etEmail)
        tilpassiword = findViewById(R.id.tilpassiword)
        etpassiword = findViewById(R.id.etpassiword)
        btncreateacount = findViewById(R.id.btncreateacount)
        btnlogin.setOnClickListener { validatelogin() }
        btnlogin.setOnClickListener {
            val intent=Intent(this,choosespecialist::class.java)
            startActivity(intent)
        }
        btncreateacount.setOnClickListener {
        var intent=Intent(this,choosespecialist::class.java)
            startActivity(intent)
        }
    }
        fun validatelogin(){
          var error=false
            tilusername.error=null
            tilEmail.error=null
            tilpassiword.error=null
            val username=etusername.text.toString()
            if (username.isBlank()){
                tilusername.error="username is required"
                error=true
            }
            var email=etEmail.text.toString()
            if (email.isBlank()){
                tilEmail.error="email is required"
                error=true
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches() ){
                tilEmail.error="Not a valid email address"
                error=true
            }

            var password=etpassiword.text.toString()
            if (password.isBlank()){
                tilpassiword.error="password is required"
                error=true
            }

            if (error!=true){


            }

            }

        }