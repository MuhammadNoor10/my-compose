package com.noor.compose.utils.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun NormalHeader(text: String) {
    Text(text = "Hello $text", color = Color(0xFFFF6347))
}