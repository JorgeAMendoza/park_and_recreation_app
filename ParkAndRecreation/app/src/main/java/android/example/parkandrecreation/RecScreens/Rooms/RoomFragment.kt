package android.example.parkandrecreation.RecScreens.Rooms

import android.example.parkandrecreation.R
import android.example.parkandrecreation.databinding.FragmentRoomsBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2

/**
 * Simple fragment that holds the view pager that will display multiple fragments.
 */
class RoomFragment : Fragment() {

    lateinit var roomAdapter: RoomAdapter
    lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentRoomsBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        roomAdapter = RoomAdapter(this)
        viewPager = view.findViewById(R.id.room_pager)
        viewPager.adapter = roomAdapter
    }

}
