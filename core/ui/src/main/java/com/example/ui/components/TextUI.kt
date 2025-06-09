package com.example.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextHeader(
    modifier: Modifier = Modifier.padding(16.dp),
    text: String = "Welcome to Login",
    color: Color = Color.Black,
){
    Text(
        text = text,
        modifier = modifier,
        style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Left
        ),
        color = color,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}


@Preview(showBackground = true)
@Composable
fun TextHeaderPreview(){
    TextHeader(text = "Welcome to the Moon")
}

@Composable
fun ClickableText(){

    val annotedText = buildAnnotatedString {
        append("Please fill Email and Password to Login.")
        pushStringAnnotation(
            tag = "TEXT_CLICKED",
            annotation = "Sign Up"
        )
        withStyle(
            style = SpanStyle(
                color = Color.Blue,
                fontWeight = FontWeight.Bold,
            )
        ) {
            append(" Sign Up")
        }
        pop()
    }
    Text(
        text = annotedText
    )
}

@Preview(showBackground = true)
@Composable
fun ClickableTextPreview(){
    ClickableText()
}











