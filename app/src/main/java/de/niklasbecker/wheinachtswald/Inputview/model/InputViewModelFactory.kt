package de.niklasbecker.wheinachtswald.Inputview.model
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class InputViewModelFactory (): ViewModelProvider.Factory{

    override fun <T: ViewModel> create(modelClass: Class<T>): T{
        if (modelClass.isAssignableFrom(InputViewModel::class.java)){
            return InputViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}