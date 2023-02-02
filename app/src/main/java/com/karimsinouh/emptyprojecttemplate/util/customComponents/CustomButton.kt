package com.karimsinouh.emptyprojecttemplate.util.customComponents

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.karimsinouh.emptyprojecttemplate.util.customContentColorFor

@Composable
fun  CustomButton(
    text:String,
    modifier: Modifier=Modifier,
    enabled:Boolean=true,
    icon:ImageVector?=null,
    @DrawableRes drawable:Int?=null,
    containerColor:Color=MaterialTheme.colorScheme.onSurface,
    shape:CornerBasedShape=MaterialTheme.shapes.medium,
    onClick:()->Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        shape = shape,
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor = customContentColorFor(color = containerColor)
        ),
        enabled = enabled
    ) {

        drawable?.let {
            Icon(painter = painterResource(id = drawable), contentDescription =null,tint=Color.Unspecified)
        }
        Text(
            text = text,
            modifier = Modifier.padding(10.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
        icon?.let{
            Icon(imageVector = icon, contentDescription = null)
        }
    }
}

@Composable
fun CustomButton(
    text:AnnotatedString,
    modifier: Modifier=Modifier,
    enabled:Boolean=true,
    icon:ImageVector?=null,
    containerColor:Color=MaterialTheme.colorScheme.onSurface,
    shape:CornerBasedShape=MaterialTheme.shapes.medium,
    onClick:()->Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        shape = shape,
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor = customContentColorFor(color = containerColor)
        ),
        enabled = enabled
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(12.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
        icon?.let{
            Icon(imageVector = icon, contentDescription = null)
        }
    }
}