package com.karimsinouh.emptyprojecttemplate.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.karimsinouh.emptyprojecttemplate.ui.home.Home
import com.karimsinouh.emptyprojecttemplate.util.SetSystemBarsColors
import com.karimsinouh.emptyprojecttemplate.util.theme.AppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    lateinit var nav:NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            nav= rememberNavController()

            AppTheme {

                SetSystemBarsColors()
                MainContent()

            }

        }
    }

    @Composable
    private fun MainContent(){
        Surface(
            modifier=Modifier.fillMaxSize()
        ) {
            MainNavHost()
        }
    }
}