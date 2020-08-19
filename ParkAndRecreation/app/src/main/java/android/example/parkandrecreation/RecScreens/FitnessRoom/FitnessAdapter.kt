package android.example.parkandrecreation.RecScreens.FitnessRoom

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * Adapter that initilzes multiple fragments of "FitnessDisplayFragment depending on amount of
 * informaiton in the database.
 */

class FitnessAdapter(fragment: Fragment): FragmentStateAdapter(fragment){

    val fitnessList = listOf<FitnessRoom>()

    override fun getItemCount(): Int = fitnessList.size

    override fun createFragment(position: Int): Fragment {
        val fragment = FitnessDisplayFragment()

        return fragment
    }
}