package android.example.parkandrecreation.RecScreens.Gymnasiums

import android.example.parkandrecreation.databinding.FragmentGymBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Simple fragment that holds the view pager that will display multiple fragments
 */
class GymFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentGymBinding.inflate(layoutInflater)

        return binding.root
    }

}
