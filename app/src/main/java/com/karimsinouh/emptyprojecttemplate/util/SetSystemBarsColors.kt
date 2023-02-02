package com.karimsinouh.emptyprojecttemplate.util

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun SetSystemBarsColors(){
    val systemUiController = rememberSystemUiController()
    val useDarkIcons= !isSystemInDarkTheme()
    val color= MaterialTheme.colorScheme.surface

    SideEffect {
        systemUiController.setSystemBarsColor(
            color = color,
            darkIcons =useDarkIcons,
        )
    }
}