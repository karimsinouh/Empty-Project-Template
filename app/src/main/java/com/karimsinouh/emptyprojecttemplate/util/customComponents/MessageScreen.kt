package com.karimsinouh.emptyprojecttemplate.util.customComponents

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MessageScreen(
    title:String,
    message:String,
    modifier: Modifier=Modifier,
    spacing: Dp =12.dp,
    icon:( @Composable ()->Unit)?=null,
    button:(@Composable ()->Unit)?=null
) {

    Surface(modifier = modifier) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.padding(54.dp),
                verticalArrangement = Arrangement.spacedBy(spacing),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                icon?.let {
                    it()
                }

                Text(text = title, fontWeight = FontWeight.Bold, fontSize = 24.sp)
                Text(
                    text = message,
                    textAlign = TextAlign.Center
                )
                button?.let {
                    it()
                }
            }
        }
    }

}