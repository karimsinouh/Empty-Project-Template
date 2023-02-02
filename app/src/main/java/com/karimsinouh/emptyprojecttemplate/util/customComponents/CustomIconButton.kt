package com.karimsinouh.artfuldreams.util.customComposables

import androidx.annotation.DrawableRes
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import com.karimsinouh.emptyprojecttemplate.util.customContentColorFor

@Composable
fun CustomIconButton(
    modifier: Modifier =Modifier,
    icon:ImageVector?=null,
    @DrawableRes drawable:Int?=null,
    selected:Boolean=false,
    enabled:Boolean=true,
    onClick:()->Unit
) {

    val containerColor=if (selected) MaterialTheme.colorScheme.onSurface else MaterialTheme.colorScheme.secondary

    FilledTonalIconButton(
        onClick = onClick,
        modifier = modifier,
        colors = IconButtonDefaults.filledTonalIconButtonColors(containerColor=containerColor),
        shape = MaterialTheme.shapes.large,
        enabled = enabled
    ) {
        icon?.let {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = customContentColorFor(color = containerColor)
            )
        }

        drawable?.let {
            Icon(
                painter = painterResource(id = drawable),
                contentDescription = null,
                tint = customContentColorFor(color = containerColor)
            )
        }

    }
}