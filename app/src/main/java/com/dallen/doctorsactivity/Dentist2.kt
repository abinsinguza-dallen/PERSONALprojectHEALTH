package com.dallen.doctorsactivity

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.dallen.doctorsactivity.databinding.ActivityDentist2Binding
import com.squareup.picasso.Picasso
import java.util.*

class Dentist2 : AppCompatActivity() {
    lateinit var binding:ActivityDentist2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDentist2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val mPickTimeBtn = findViewById<Button>(R.id.pickDateBtn)
        val textView = findViewById<TextView>(R.id.dateTv)
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        mPickTimeBtn.setOnClickListener {

            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in TextView
                textView.setText("" + dayOfMonth + " " + month + ", " + year)
            }, year, month, day)
            dpd.show()

        }
    }

    fun getExtras() {
        val extras = intent.extras
        var name = extras?.getString("NAME", "")
        var phone = extras?.getString("PHONENUMBER", "")
        var email = extras?.getString("EMAIL", "")
        var address = extras?.getString("LOCATION", "")
        var image = binding.imgDisplay

        Toast.makeText(this,name, Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone, Toast.LENGTH_LONG).show()
        binding.tvname1.text=name
        binding.tvphoneNumber.text=phone
        binding.tvEmaill.text=email
        binding.tvLocation.text=address
        Picasso.get().load(intent.getStringExtra("IMAGE"))
            .resize(600,600)
            .centerCrop()
            .into(image)
    }
}