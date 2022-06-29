package com.dallen.doctorsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.ButtonBarLayout

class choosespecialist : AppCompatActivity() {
    lateinit var btndestine:Button
    lateinit var btneyes:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choosespecialist)
        btndestine=findViewById(R.id.btndestine)
        btneyes=findViewById(R.id.btneyes)
        btndestine.setOnClickListener {
            var intent=Intent(this,Dentists::class.java)
            startActivity(intent)
        }
        btneyes.setOnClickListener {
            var intent=Intent(this,EyeDiseasesActivity::class.java)
            startActivity(intent)
        }
    }
}