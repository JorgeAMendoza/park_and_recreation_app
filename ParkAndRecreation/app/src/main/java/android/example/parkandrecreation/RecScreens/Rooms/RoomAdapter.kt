package android.example.parkandrecreation.RecScreens.Rooms

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class RoomAdapter(fragment: Fragment): FragmentStateAdapter(fragment){
    override fun getItemCount(): Int = 1

    override fun createFragment(position: Int): Fragment {
        return RoomDisplayFragment()
    }
}