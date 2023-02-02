package com.karimsinouh.emptyprojecttemplate.util.customComponents


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.karimsinouh.emptyprojecttemplate.R

@Composable
fun FailureDialog(
    message:String?,
    onDismiss:()->Unit
) {

    AlertDialog(
        onDismissRequest = onDismiss,
        text = {
            Text(
                text = message ?: stringResource(id = R.string.try_again_later),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        },
        confirmButton = {
            CustomButton(
                text = stringResource(R.string.got_it),
                onClick = onDismiss,
                icon = Icons.Default.Done
            )
        },
        title = {
            Text(text = stringResource(R.string.something_went_wrong), textAlign = TextAlign.Center,modifier= Modifier.fillMaxWidth())
        },
        tonalElevation = 0.dp
    )

}

@Composable
fun ConfirmDialog(
    title:String,
    message:String,
    confirmButton: @Composable ()->Unit,
    onDismiss:()->Unit,
) {

    AlertDialog(
        onDismissRequest = onDismiss,
        text = {
            Text(
                text = message,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        },
        confirmButton = {
            confirmButton()
        },
        title = {
            Text(text = title, textAlign = TextAlign.Center,modifier= Modifier.fillMaxWidth())
        },
        tonalElevation = 0.dp
    )

}