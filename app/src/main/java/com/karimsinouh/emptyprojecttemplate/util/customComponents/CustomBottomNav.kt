package com.karimsinouh.emptyprojecttemplate.util.customComponents

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.karimsinouh.emptyprojecttemplate.util.screen.Screen
import com.karimsinouh.emptyprojecttemplate.R

@Composable
fun CustomBottomNavigation(
    currentScreenId:String?= Screen.Home.route,
    onItemSelected:(Screen)->Unit
) {

    val items= emptyList<Screen>()
    val shape=RoundedCornerShape(topEnd =24.dp, topStart = 24.dp)

    Row(
        modifier= Modifier
            .clip(shape)
            .background(MaterialTheme.colorScheme.secondary.copy(alpha = 0.3f))
            .padding(14.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {

        items.forEach { item->

            CustomBottomNavigationItem(item = item, isSelected = item.route==currentScreenId) {
                onItemSelected(item)
            }

        }

    }

}

@Composable
fun CustomBottomNavigationItem(item: Screen, isSelected:Boolean, onClick:()->Unit){

    val background=if (isSelected) MaterialTheme.colorScheme.secondary else Color.Transparent
    val contentColor=MaterialTheme.colorScheme.onBackground

    Box(
        modifier = Modifier
            .clip(CircleShape)
            .background(background)
            .clickable(onClick = onClick)
    ){
        Row(
            modifier=Modifier
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {

            item.icon?.let{
                Icon(
                    imageVector = it,
                    contentDescription =null,
                    tint = contentColor
                )
            }

            item.drawable?.let {
                Icon(
                    painter = painterResource(id = it),
                    contentDescription =null,
                    tint = contentColor
                )
            }


            AnimatedVisibility(visible = isSelected) {
                Text(
                    text = stringResource(id = item.title?:R.string.app_name),
                    color=contentColor
                )
            }

        }
    }


}