package com.noor.compose.ui.login

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.noor.compose.utils.composable.NormalHeader
import com.noor.compose.utils.composable.PrimaryButton

@Composable
fun BuildLoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        NormalHeader(text = "Welcome to Compose KTMB App")
        PrimaryButton(text = "Login") {

        }
    }
}