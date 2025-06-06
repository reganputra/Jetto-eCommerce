package com.example.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun JettoImageViewClick(
    onClick: () -> Unit = { /* No-op */ },
    color: Color = Color.White,
    imageVector: ImageVector = Icons.Default.ArrowBack,
    imageDescription: String = "Back",
    modifier: Modifier = Modifier.size(24.dp)
) {
    IconButton(onClick = {onClick()}) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = imageDescription,
            modifier = modifier
        )
    }
}

@Preview
@Composable
fun JettoImageViewClickPreview() {
    JettoImageViewClick()
}