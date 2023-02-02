package com.karimsinouh.emptyprojecttemplate.ui.main

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.karimsinouh.emptyprojecttemplate.ui.home.Home
import com.karimsinouh.emptyprojecttemplate.util.screen.Screen

@Composable
fun MainActivity.MainNavHost() {

    NavHost(
        navController = nav,
        startDestination = Screen.Home.route
    ){

        composable(Screen.Home.route){
            Home()
        }

    }

}