package android.example.parkandrecreation.RecScreens


import android.example.parkandrecreation.R
import android.example.parkandrecreation.databinding.FragmentRecreationCenterBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs

/**
 * Recreation center page that is used constantly for different recreation centers.
 */
class RecreationCenterFragment : Fragment() {

    private lateinit var viewModel: RecreationCenterViewModel
    private lateinit var viewModelFactory: RecreationCenterViewModelFactory


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentRecreationCenterBinding.inflate(layoutInflater)

        //get recKey from previous fragment depending on what was clicked.
        val args = RecreationCenterFragmentArgs.fromBundle(arguments!!)
        val recKey = args.recID

        //create ViewModel to display correct page name
        viewModelFactory = RecreationCenterViewModelFactory(recKey)
        viewModel = ViewModelProvider(this, viewModelFactory)
            .get(RecreationCenterViewModel::class.java)

        //set recTitle depending on ViewModel.
        binding.recTitle.text = viewModel.recText


        binding.programButton.setOnClickListener{
            it.findNavController().navigate(RecreationCenterFragmentDirections.actionRecreationCenterFragmentToProgramFragment(recKey))
        }

        binding.gymButton.setOnClickListener{
            it.findNavController().navigate(RecreationCenterFragmentDirections.actionRecreationCenterFragmentToGymFragment(recKey))
        }

        binding.eventButton.setOnClickListener{
            it.findNavController().navigate(RecreationCenterFragmentDirections.actionRecreationCenterFragmentToEventsFragment(recKey))
        }

        binding.fitnessButton.setOnClickListener{
            it.findNavController().navigate(RecreationCenterFragmentDirections.actionRecreationCenterFragmentToFitnessFragment(recKey))
        }

        binding.roomButton.setOnClickListener{
            it.findNavController().navigate(RecreationCenterFragmentDirections.actionRecreationCenterFragmentToRoomFragment(recKey))
        }

        binding.martinParkButton.setOnClickListener{
            it.findNavController().navigate(RecreationCenterFragmentDirections.actionRecreationCenterFragmentToParkFragment(recKey))
        }

        return binding.root
    }
}
