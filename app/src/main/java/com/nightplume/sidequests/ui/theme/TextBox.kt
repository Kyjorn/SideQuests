package com.nightplume.sidequests.ui.theme

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

/*
* This class is for the text fields required in the app
* contains all the settings for the field
*/

@Composable
fun TextBox (
    labelText: String,
    textBox: String,
    onValueChange: (String) -> Unit
){
    TextField(
        value = textBox,
        onValueChange = onValueChange,
        label = {Text(labelText)}
    )
}
