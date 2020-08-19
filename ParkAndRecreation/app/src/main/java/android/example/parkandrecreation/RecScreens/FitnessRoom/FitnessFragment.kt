package android.example.parkandrecreation.RecScreens.FitnessRoom

import android.example.parkandrecreation.R
import android.example.parkandrecreation.databinding.FragmentFitnessBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2

/**
 * Fragment for hte FitnessDisplay Fragment. This page is empty, the Fragment Adapter will insert
 * information on the page during runntime.
 */
class FitnessFragment : Fragment() {

    lateinit var fitnessAdapter: FitnessAdapter
    lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentFitnessBinding.inflate(layoutInflater)

        return binding.root
    }

    //initialize the viewPager to the fragment adapter.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fitnessAdapter = FitnessAdapter(this)
        viewPager = view.findViewById(R.id.fitness_pager)
        viewPager.adapter = fitnessAdapter
    }

}
