package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.PurpleGrey80


@Composable
fun EditTextUi(
    value: String,
    onValueChange: (String) -> Unit = {},
    textStyle: TextStyle,
    singleLine: Boolean,
    maxLines: Int
){
    BasicTextField(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
            .border(width = 1.dp, color = PurpleGrey80, shape = RoundedCornerShape(8.dp))
            .background(color = Color.White).padding(8.dp),
        value = value,
        onValueChange = {onValueChange(it)},
        textStyle = TextStyle(fontSize = 14.sp, color = Color.Black),
        singleLine = true,
        maxLines = 1
    )
}

@Preview(showBackground = true)
@Composable
fun EditTextUiPreview() {
    EditTextUi(
        value = "Sample Text",
        onValueChange = {},
        textStyle = TextStyle(),
        singleLine = true,
        maxLines = 1
    )
}