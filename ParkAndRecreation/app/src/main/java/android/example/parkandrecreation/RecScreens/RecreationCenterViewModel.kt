package android.example.parkandrecreation.RecScreens

import android.example.parkandrecreation.RecScreens.RecreationCenterFragmentArgs
import androidx.lifecycle.ViewModel

/**
 * ViewModel used to set recreation title on RecreationCenterFragment
 */

class RecreationCenterViewModel(recKey: String) : ViewModel(){

     var recText: String = ""

    //initialize recreation center title text
    init {
        when (recKey){
            "MW" -> recText = "Martin Weiss Recreation Center"
            "KP" -> recText = "Kiest Recreation Center"
            "BK" -> recText = "Beckley Saner Recreation Center"
            "AM" -> recText = "Anita Martinez Recreation Center"
            "AK" -> recText = "Arkadia Recreation Center"
            else -> recText = "Invalid Recreation Center"
        }
    }
}