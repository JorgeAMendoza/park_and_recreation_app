package android.example.parkandrecreation.RecScreens.HomePage

import android.example.parkandrecreation.R
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecCardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var recName: TextView = itemView.findViewById(R.id.rec_name)
    var recImage: ImageView = itemView.findViewById(R.id.rec_image)
}