package com.karimsinouh.emptyprojecttemplate.util

import android.content.Context
import android.content.Intent
import android.net.Uri

fun openLink(url:String,context: Context){
    val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
    context.startActivity(intent)
}