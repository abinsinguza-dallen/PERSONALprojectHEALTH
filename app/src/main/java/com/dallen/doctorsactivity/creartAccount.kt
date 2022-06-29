package com.dallen.doctorsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class creartAccount : AppCompatActivity() {
    lateinit var btnspecialists:Button
    lateinit var btncreate:Button
    lateinit var tilfirstname:TextInputLayout
    lateinit var etfirstname:TextInputEditText
    lateinit var tilsecondname:TextInputLayout
    lateinit var etsecondname:TextInputEditText
    lateinit var tilpassword:TextInputLayout
    lateinit var etpassword:TextInputEditText
    lateinit var tilsecond:TextInputLayout
    lateinit var etEmail:TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creart_account)
        btncreate=findViewById(R.id.btncreate)
        tilfirstname=findViewById(R.id.tilusername)
        etfirstname=findViewById(R.id.etusername)
        tilsecondname=findViewById(R.id.tilsecondname)
        etsecondname=findViewById(R.id.etsecondname)
        tilsecond=findViewById(R.id.tilsecond)
        etEmail=findViewById(R.id.etEmail)
        tilpassword=findViewById(R.id.tilpassword)
        etpassword=findViewById(R.id.etpassword)
        btnspecialists=findViewById(R.id.btnspecialists)
        btncreate.setOnClickListener { validate() }
        btnspecialists.setOnClickListener {
            var intent = Intent(this, choosespecialist::class.java)
            startActivity(intent)
        }

    }
    fun validate(){
        var error=false
        tilfirstname.error=null
        tilsecondname.error=null
        tilpassword.error=null
        val firstname=etfirstname.text.toString()
        if (firstname.isBlank()){
            tilfirstname.error="firstname is required"
           error=true
        }
        var secondname=etsecondname.text.toString()
        if (secondname.isBlank()){
            tilsecondname.error="secondname is require"
            error=true
        }
        var email=etEmail.text.toString()
        if (email.isBlank()){
            tilsecond.error="email is required"
            error=true
        }
        var password=etpassword.text.toString()
        if (password.isBlank()){
            tilpassword.error="password is required"
            error=true
        }
        if (error!=true){}
    }
}
