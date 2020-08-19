package android.example.parkandrecreation.RecScreens.ProgramScreens


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.example.parkandrecreation.R
import android.example.parkandrecreation.databinding.FragmentProgramBinding
import androidx.viewpager2.widget.ViewPager2

/**
 * Simple fragment that holds the view pager that will display multiple fragments
 */
class ProgramFragment : Fragment() {

    lateinit var programAdapter: ProgramAdapter
    lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentProgramBinding.inflate(layoutInflater)
        return binding.root
    }

    //initialize the viewPager component to the programAdapter.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val key = ProgramFragmentArgs.fromBundle(arguments!!).recID
        programAdapter = ProgramAdapter(this, key)
        viewPager = view.findViewById(R.id.program_pager)
        viewPager.adapter = programAdapter
    }

}
