package android.example.parkandrecreation.RecScreens.Gymnasiums

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.example.parkandrecreation.R
import android.example.parkandrecreation.databinding.FragmentGymDisplayBinding

/**
 * Fragment created by GymAdapter that is displayed in the viewPager inside GymFragment
 */
class GymDisplayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentGymDisplayBinding.inflate(layoutInflater)

        return binding.root
    }

}
