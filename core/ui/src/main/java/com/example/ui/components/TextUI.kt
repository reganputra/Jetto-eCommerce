package com.example.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
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
import com.example.ui.theme.VividMagenta

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
            lineHeight = 24.sp,
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
fun JettoClickableText(
    modifier: Modifier = Modifier.padding(16.dp),
    text: String = "Please fill Email and Password to Login.",
    textClick : String = "Sign Up",
    onClick: () -> Unit = { /* No-op */ },
){

    val annotedText = buildAnnotatedString {
        append(text)
        pushStringAnnotation(
            tag = "TEXT_CLICKED",
            annotation = textClick
        )
        withStyle(
            style = SpanStyle(
                color = VividMagenta,
                fontWeight = FontWeight.Bold,
            )
        ) {
            append(" Sign Up")
        }
        pop()
    }
    ClickableText(
        text = annotedText,
        modifier = modifier,
        style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 24.sp,
            color = Color.Black,
            textAlign = TextAlign.Left
        ),
        onClick = { offset ->
            annotedText.getStringAnnotations(
                tag = "TEXT_CLICKED",
                start = offset,
                end = offset
            ).firstOrNull()?.let {
                onClick()
            }
        }
    )

}

@Preview(showBackground = true)
@Composable
fun ClickableTextPreview(){
    JettoClickableText()
}

@Composable
fun JettoRegularText(
    modifier: Modifier = Modifier.padding(16.dp),
    text: String = "E-Mail",
    color: Color = Color.Black,
){
    Text(
        text = text,
        modifier = modifier,
        style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            color = color,
            lineHeight = 16.sp,
            textAlign = TextAlign.Left
        )
    )
}


@Preview(showBackground = true)
@Composable
fun JettoRegularTextPreview(){
    JettoRegularText()
}









