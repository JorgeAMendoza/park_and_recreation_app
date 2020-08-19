package android.example.parkandrecreation.RecScreens.FitnessRoom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.example.parkandrecreation.R
import android.example.parkandrecreation.databinding.FragmentFitnessDisplayBinding

/**
 * Fragment for FitnesFragment that will be used to display the information on a page. This
 * fragment in instantiated from the FragmentAdapter.
 */

class FitnessDisplayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentFitnessDisplayBinding.inflate(layoutInflater)

        return binding.root
    }

}
