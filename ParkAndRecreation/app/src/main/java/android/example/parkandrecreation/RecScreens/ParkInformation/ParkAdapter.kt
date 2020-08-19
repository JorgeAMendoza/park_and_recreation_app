package android.example.parkandrecreation.RecScreens.ParkInformation

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ParkAdapter(fragment: Fragment): FragmentStateAdapter(fragment){

    override fun getItemCount(): Int = 1

    override fun createFragment(position: Int): Fragment {
        return ParkDisplayFragment()
    }
}
