package android.example.parkandrecreation.RecScreens.ParkInformation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.example.parkandrecreation.R
import android.example.parkandrecreation.databinding.FragmentParkDisplayBinding

/**
 * A simple [Fragment] subclass.
 */
class ParkDisplayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentParkDisplayBinding.inflate(layoutInflater)

        return binding.root
    }

}
