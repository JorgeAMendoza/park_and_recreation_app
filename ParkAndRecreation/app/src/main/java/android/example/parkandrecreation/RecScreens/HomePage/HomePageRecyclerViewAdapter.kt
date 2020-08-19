package android.example.parkandrecreation.RecScreens.HomePage


import android.example.parkandrecreation.R
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

/**
 *
 */
class HomePageRecyclerViewAdapter internal constructor(private val recList: List<RecCenters>):
    RecyclerView.Adapter<RecCardViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecCardViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.rec_cardview, parent, false)
        return RecCardViewHolder(
            layoutView
        )
    }

    override fun onBindViewHolder(holder: RecCardViewHolder, position: Int) {
        if(position < recList.size){
            val rec = recList[position]
            holder.recName.text = rec.recName
            holder.recImage.setImageResource(rec.recImage)
            holder.itemView.setOnClickListener{
                it.findNavController().navigate(
                    HomepageFragmentDirections.actionHomepageFragmentToRecreationCenterFragment(
                        rec.recID
                    )
                )
            }
        }
    }

    override fun getItemCount(): Int {
        return recList.size
    }
}