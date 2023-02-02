package com.karimsinouh.emptyprojecttemplate.util.customComponents

import androidx.compose.runtime.Composable
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Indicators(
    size:Int,
    selectedItem:Int,
    modifier: Modifier=Modifier,
    color: Color=MaterialTheme.colorScheme.primary,
    spacing:Dp=18.dp,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(spacing),
        modifier = modifier.fillMaxWidth()
    ) {
        repeat(size){
            Indicator(isSelected = it == selectedItem,color)
        }
    }

}

@Composable
fun RowScope.Indicator(isSelected:Boolean,color:Color) {

    val width= animateDpAsState(
        targetValue = if (isSelected) 20.dp else 10.dp,
        animationSpec = spring(dampingRatio = Spring.DampingRatioLowBouncy)
    )

    val color1= if (isSelected) color else MaterialTheme.colorScheme.surfaceVariant
    val animatedColor= animateColorAsState(targetValue = color1)

    Box(modifier = Modifier
        .fillMaxWidth()
        .height(5.dp)
        .clip(CircleShape)
        .weight(1f)
        .background(animatedColor.value),
    )

}