package com.dallen.doctorsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EyeDiseasesActivity : AppCompatActivity() {
    lateinit var btnAye1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eye_diseases)
        btnAye1=findViewById(R.id.btnAye1)

        btnAye1.setOnClickListener {
            var intent=Intent(this,ayeee1::class.java)
            startActivity(intent)
        }
    }
}