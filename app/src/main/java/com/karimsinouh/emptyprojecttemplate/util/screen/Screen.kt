package com.karimsinouh.emptyprojecttemplate.util.screen

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.karimsinouh.emptyprojecttemplate.R

sealed class Screen(
    val route:String,
    @StringRes val title:Int?=null,
    val icon: ImageVector?=null,
    @DrawableRes val drawable:Int?=null,
){

    //Main Screens
    object Home: Screen("Home", R.string.home, icon = Icons.Default.Home)

    /*
    //Auth Screens
    object OnBoarding: Screen("onBoarding")
    object Login: Screen("login")
    object SignUp: Screen("signup")
    object ResetPassword: Screen("resetPassword")
     */

}