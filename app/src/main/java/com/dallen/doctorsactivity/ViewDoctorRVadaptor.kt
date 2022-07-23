import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.dallen.doctorsactivity.Dentist2
import com.dallen.doctorsactivity.Doctors
import com.dallen.doctorsactivity.R
import com.squareup.picasso.Picasso

class ViewDoctorRVadaptor(var doctorslist:List<Doctors>): RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var itemView= LayoutInflater .from(parent.context).inflate(R.layout.item_list,parent,false)
        return TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentTweets=doctorslist.get(position)
        holder.tvName.text=currentTweets.name
        holder.tvHospital.text=currentTweets.hospital
        holder.tvqualification.text=currentTweets.qualif
        Picasso.get().load(currentTweets.image).resize(300,300)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_account_circle_24)
//            .into(holder.binding.ivContatct)
        val context= holder.itemView.context
        var currentContacts=doctorslist.get(position)
        with(holder){
            tvName.text=currentTweets.name
            tvHospital.text=currentTweets.hospital
            tvqualification.text=currentTweets.qualif
            Picasso.get()
                .load(currentContacts.image)
                .resize(350,350)
                .centerCrop()
                .into(ivContatct)
        }
        holder.ivContatct.setOnClickListener {
            Toast
                .makeText(context,"you have clicked the image", Toast.LENGTH_SHORT)
                .show()
        }
        holder.binding.cvcontacts.setOnClickListener {
            val intent= Intent(context,Dentist2::class.java)
            intent.putExtra("NAME",currentTweets.name)
            intent.putExtra("ADDRESS",currentTweets.hospital)
            intent.putExtra("PHONENUMBER",currentTweets.qualif)
            intent.putExtra("IMAGE",currentTweets.image)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return doctorslist.size

    }
}
class TweetViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
   var tvName=itemView.findViewById<TextView>(R.id.tvName)
   var tvHospital=itemView.findViewById<TextView>(R.id.tvHospital)
   var tvqualification=itemView.findViewById<TextView>(R.id.tvqualification)
}
