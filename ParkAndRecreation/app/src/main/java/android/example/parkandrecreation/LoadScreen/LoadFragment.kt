package android.example.parkandrecreation.LoadScreen


import android.example.parkandrecreation.R
import android.example.parkandrecreation.databinding.FragmentLoadBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation

/**
 * First fragment user will see when booting up the application.
 * Will ensure all components boot up correctly before moving on.
 */
class LoadFragment : Fragment() {

    lateinit var viewModel: LoadViewModel
    private var _binding: FragmentLoadBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflate the layout for this fragment
        _binding = FragmentLoadBinding.inflate(inflater, container, false)
        val view = binding.root

        //intitlize viewModel to separate UI logic from fragment interface
        viewModel = ViewModelProvider(this).get(LoadViewModel::class.java)

        //set picture of city depending on time.
        binding.cityImage.setImageResource(viewModel.drawableResource)

        binding.navButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loadFragment_to_homepageFragment)
        )
        return view
    }

    //clean up system resources
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


