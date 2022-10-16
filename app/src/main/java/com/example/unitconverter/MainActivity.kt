package com.example.unitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.Surface
import com.example.unitconverter.composables.ConverterScreen
import com.example.jetpackcomposeunitconverter.ui.theme.JetpackComposeUnitConverterTheme

class MainActivity : ComponentActivity() {
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeUnitConverterTheme {
                Surface {
                    ConverterScreen()
                }
            }
        }
    }
}