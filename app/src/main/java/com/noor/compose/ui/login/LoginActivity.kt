package com.noor.compose.ui.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.noor.compose.ui.theme.MyAppTheme

class LoginActivity :  ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                BuildLoginScreen()
            }
        }
    }
}