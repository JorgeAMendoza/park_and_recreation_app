package android.example.parkandrecreation.LoadScreen

import android.example.parkandrecreation.R
import androidx.lifecycle.ViewModel
import java.util.Calendar

/**
 * ViewModel to set image on Load screen depending on the time of day.
 */

class LoadViewModel : ViewModel() {

    private var currentTime = Calendar.HOUR_OF_DAY

    var drawableResource = when (currentTime){
        in 1..10 -> R.drawable.morning_image
        in 11..17 -> R.drawable.afternoon_image
        else -> R.drawable.night_image
    }
}