package com.karimsinouh.emptyprojecttemplate.util.customComponents

import androidx.annotation.RawRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun LottieFile(
    @RawRes id:Int,
    modifier: Modifier=Modifier,
    iterations:Int?=LottieConstants.IterateForever
) {
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(id))
    LottieAnimation(
        composition = composition,
        iterations = iterations ?: 1,
        modifier = modifier
    )
}