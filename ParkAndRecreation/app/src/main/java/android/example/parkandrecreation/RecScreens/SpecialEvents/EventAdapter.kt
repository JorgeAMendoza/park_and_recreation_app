package android.example.parkandrecreation.RecScreens.SpecialEvents

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class EventAdapter (fragment:Fragment): FragmentStateAdapter(fragment){

    override fun getItemCount(): Int = 1

    override fun createFragment(position: Int): Fragment {
        return EventDisplayFragment()
    }
}