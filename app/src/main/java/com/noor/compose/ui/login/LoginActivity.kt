package com.noor.compose.ui.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
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





    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview(){
        MaterialTheme {
            BuildLoginScreen()
        }
    }
}