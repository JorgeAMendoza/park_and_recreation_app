package android.example.parkandrecreation.RecScreens.SpecialEvents

import android.example.parkandrecreation.R
import android.example.parkandrecreation.databinding.FragmentEventsBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2

/**
 * Simple fragment that holds the view pager that will display multiple fragments
 */
class EventsFragment : Fragment() {

    lateinit var viewPager: ViewPager2
    lateinit var eventAdapter: EventAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentEventsBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        eventAdapter = EventAdapter(this)
        viewPager = view.findViewById(R.id.events_Pager)
        viewPager.adapter = eventAdapter
    }

}
