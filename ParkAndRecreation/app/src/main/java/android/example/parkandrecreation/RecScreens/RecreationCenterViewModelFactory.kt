package android.example.parkandrecreation.RecScreens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

/**
 * ViewModel Factory that creates viewModels of type RecreationCenterViewModel, takes in recKey
 * argument.
 */

class RecreationCenterViewModelFactory(private val recKey: String): ViewModelProvider.Factory{
    override fun <T: ViewModel?> create(modelClass: Class<T>): T{
        if(modelClass.isAssignableFrom(RecreationCenterViewModel::class.java)){
            return RecreationCenterViewModel(recKey) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}