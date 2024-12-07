package de.niklasbecker.wheinachtswald

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import de.niklasbecker.wheinachtswald.ui.theme.WheinachtswaldTheme
import androidx.compose.foundation.layout.*
import androidx.lifecycle.ViewModelProvider
import de.niklasbecker.wheinachtswald.Inputview.InputView
import de.niklasbecker.wheinachtswald.Inputview.model.InputViewModel
import de.niklasbecker.wheinachtswald.Inputview.model.InputViewModelFactory


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val inputViewModelFactory = InputViewModelFactory()
        val inputViewModel = ViewModelProvider(this, inputViewModelFactory)[InputViewModel::class.java]
        setContent {
            WheinachtswaldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column  (modifier = Modifier.fillMaxWidth()){
                        WheinnachtswaldApp(inputViewModel)

                    }




                }
            }
        }
    }
}

@Composable
fun WheinnachtswaldApp(inputViewModel: InputViewModel) {
    InputView(inputViewModel)

}

