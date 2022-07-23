package com.dallen.doctorsactivity

import ViewDoctorRVadaptor
import android.app.backup.BackupDataInputStream
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.dallen.doctorsactivity.databinding.ActivityDentistsBinding

class Dentists : AppCompatActivity() {
    lateinit var binding: ActivityDentistsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDentistsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaytweet()
    }
    fun displaytweet(){
        var tweet1=Doctors("Abinsinguza Dallen","Dentist","Mulago Hospital","https://media.istockphoto.com/photos/we-offer-our-patients-premium-healthcare-here-picture-id638647058?s=612x612")
        var tweet2=Doctors("Niwabiine Speria","Dentist","Nsambya","https://media.istockphoto.com/photos/happy-african-american-female-doctor-or-scientist-picture-id1310047621?s=612x612")
        var tweet3=Doctors("Anena Beatrice","Dentist","Mulago Hospital","https://media.istockphoto.com/photos/doctors-online-medical-consultation-african-american-physician-is-a-picture-id1315185683?s=612x612")
        var tweet4=Doctors("Seth Niwabiine","Dentist","Kisizi Hospital; ","https://media.istockphoto.com/photos/its-my-mission-to-guide-you-towards-better-health-picture-id1299619779?s=612x612")
        var tweet5=Doctors("Ampumuza Monic","Dentist","Kihihi Hospital","https://media.istockphoto.com/photos/shot-of-a-young-doctor-using-a-digital-tablet-in-a-modern-hospital-picture-id1366374033?s=612x612")
        var tweet6=Doctors("Muhumuza Joshua","Dentist","Kambuga Hospital","https://images.unsplash.com/photo-1536064479547-7ee40b74b807?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80")
        var tweet7=Doctors("Mary NKuru","Dentist","Nyakibale Hospital","https://images.unsplash.com/photo-1579165466949-3180a3d056d5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80")
        var tweet8=Doctors("Kamugisha Roberts","Dentist","Kamwenge Hospital","https://media.istockphoto.com/photos/smiling-black-female-doctor-in-white-coat-posing-with-folded-arms-picture-id1201657177?s=612x612")
        var tweet9=Doctors("Valary Uhuru","Dentist","Novik Hospital","https://media.istockphoto.com/photos/portrait-of-black-female-doctor-picture-id485765842?s=612x612")
        var tweet10=Doctors("Wendy Orengo","Dentist","Jinja Hospital","https://media.istockphoto.com/photos/doctor-with-a-stethoscope-hand-in-her-pocket-closeup-of-a-female-picture-id1397648814")
        var tweet11=Doctors("Pudence","Dentist","Katata Hospital","https://media.istockphoto.com/photos/happy-african-woman-with-stethoscope-picture-id1252880889?s=612x612")
        var tweet12=Doctors("JOn karim","Destist","JJAJA Hospital","https://media.istockphoto.com/photos/happy-african-woman-with-stethoscope-picture-id1252880889?s=612x612")

        var DoctorsList= listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8,tweet9,tweet10,tweet11,tweet12)
         var contactAdaptor=ViewDoctorRVadaptor(DoctorsList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactAdaptor

    }
}
