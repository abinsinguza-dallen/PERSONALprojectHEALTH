package com.dallen.doctorsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Dentists : AppCompatActivity() {
    lateinit var btnappoint2:Button
    lateinit var btnappoint4:Button
    lateinit var btnappointment:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dentists)
        btnappointment=findViewById(R.id.btnappointment)
        btnappoint4=findViewById(R.id.btnappoint4)
        btnappoint2=findViewById(R.id.btnappoint2)
        btnappointment.setOnClickListener {
            var intent=Intent(this,BookAppoint::class.java)
            startActivity(intent)
        }
        btnappoint2.setOnClickListener {
            var intent=Intent(this,Dentist2::class.java)
            startActivity(intent)
        }
        btnappoint4.setOnClickListener {
            var intent=Intent(this,Dentist3::class.java)
            startActivity(intent)
        }
    }
}