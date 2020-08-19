package android.example.parkandrecreation.RecScreens.Rooms

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.example.parkandrecreation.R
import android.example.parkandrecreation.databinding.FragmentRoomDisplayBinding

/**
 *
 */
class RoomDisplayFragment : Fragment() {

    lateinit var binding: FragmentRoomDisplayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRoomDisplayBinding.inflate(layoutInflater)

        return binding.root
    }

}
