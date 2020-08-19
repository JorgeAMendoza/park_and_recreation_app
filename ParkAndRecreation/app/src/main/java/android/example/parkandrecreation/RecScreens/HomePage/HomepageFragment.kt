package android.example.parkandrecreation.RecScreens.HomePage


import android.example.parkandrecreation.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_homepage.view.*

/**
 * Home page to display card views for each recreation center, implements Recycler View for re-use
 * of cardviews for efficient code.
 */
class HomepageFragment : Fragment(){

    //lateinit var centers: ParkRecDatabase

    val MartinWeiss =
        RecCenters(
            "MW",
            "Martin Weiss",
            R.drawable.night_image
        )
    val Kiest = RecCenters(
        "KP",
        "Kiest",
        R.drawable.afternoon_image)

    val recreationList = listOf<RecCenters>(MartinWeiss, Kiest)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflate the binding layout
        val view = inflater.inflate(R.layout.fragment_homepage, container, false)

        //Set up recycler view
        view.recycler.setHasFixedSize(true)
        view.recycler.layoutManager = GridLayoutManager(
            context, 2, RecyclerView.VERTICAL, false)

        val adapter =
            HomePageRecyclerViewAdapter(
                recreationList
            )

        //connect recyclerview component in layout file to adapter.
        view.recycler.adapter = adapter
        val largePadding = resources.getDimensionPixelSize(R.dimen.rec_grid_spacing)
        val smallPadding = resources.getDimensionPixelSize(R.dimen.rec_grid_spacing_small)
        view.recycler.addItemDecoration(
            RecGridItemDecoration(
                largePadding,
                smallPadding
            )
        )
        // Inflate the layout for this fragment
        return view
    }
}
