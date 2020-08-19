package android.example.parkandrecreation.RecScreens.ProgramScreens

import android.example.parkandrecreation.databinding.FragmentProgramDisplayBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Fragment that is initialized by the program adapter.
 */
class ProgramDisplayFragment : Fragment() {

    lateinit var binding: FragmentProgramDisplayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProgramDisplayBinding.inflate(layoutInflater)

        return binding.root
    }

    //set information from ProgramAdapter to display on the screen for this fragment.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey("name") }?.apply{
            binding.programName.text = getString("name")
            binding.programDescription.text = getString("info")
            binding.programImage.setImageResource(getInt("image"))
        }
    }

}
