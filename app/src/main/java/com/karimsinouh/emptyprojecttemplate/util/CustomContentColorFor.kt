package com.karimsinouh.emptyprojecttemplate.util

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun customContentColorFor(color:Color) =
    when(color){
        MaterialTheme.colorScheme.surface->MaterialTheme.colorScheme.onSurface
        MaterialTheme.colorScheme.onSurface->MaterialTheme.colorScheme.surface
        MaterialTheme.colorScheme.surfaceVariant->MaterialTheme.colorScheme.onSurfaceVariant
        MaterialTheme.colorScheme.onSurface->MaterialTheme.colorScheme.surfaceVariant
        else -> MaterialTheme.colorScheme.contentColorFor(color)
    }