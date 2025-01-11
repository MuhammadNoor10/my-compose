package com.noor.compose.ui.login

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.noor.compose.R
import com.noor.compose.ui.components.PrimaryButton
import com.noor.compose.ui.components.TextAnnotatedPrimary
import com.noor.compose.ui.components.TextClickablePrimary
import com.noor.compose.ui.components.TextFieldCustomPrimary
import com.noor.compose.ui.components.TextPrimaryBold22
import com.noor.compose.ui.components.TextPrimaryRegular12
import com.noor.compose.ui.graphics.Charcoal100

@Composable
fun BuildLoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
    ) {
        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f)
                .align(Alignment.BottomCenter),
            shape = RoundedCornerShape(12.dp, 12.dp, 0.dp, 0.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White),
                verticalArrangement = Arrangement.Top
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    TextPrimaryBold22(text = "Log In")
                    Spacer(modifier = Modifier.height(16.dp))
                    TextFieldCustomPrimary(text = "myemail@compose.com", label = "Email Address")
                    Spacer(modifier = Modifier.height(12.dp))
                    TextFieldCustomPrimary(label = "Password")

                    Box(
                        modifier = Modifier
                            .align(Alignment.End)
                            .padding(vertical = 6.dp)
                    ) {
                        TextClickablePrimary(text = "Forgot Password/Activate", {
                            //Navigate to ForgotPassword or Activate screen
                        })
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                    PrimaryButton(text = "Login") {}

                    OtherLoginMethods()

                }
            }
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

@Composable
fun OtherLoginMethods(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
                .padding(horizontal = 32.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            HorizontalDivider(
                color = Charcoal100,
                thickness = 3.dp,
                modifier = Modifier.weight(0.3f)
            )


            Box(modifier = Modifier
                .weight(0.4f)
                .fillMaxHeight()
                .padding(horizontal = 8.dp),
                contentAlignment = Alignment.Center
            ) {
                TextPrimaryRegular12(text = "or continue with")
            }

            HorizontalDivider(
                color = Charcoal100,
                thickness = 3.dp,
                modifier = Modifier.weight(0.3f)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Google",
                modifier = Modifier
                    .width(40.dp)
                    .height(30.dp)
                    .clickable {
                        //on google icon clicked
                    }
            )

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Google",
                modifier = Modifier
                    .width(40.dp)
                    .height(30.dp)
                    .clickable {
                        //on google icon clicked
                    }
            )
        }

        val context = LocalContext.current

        TextAnnotatedPrimary {
            Toast.makeText(context, "Sign up", Toast.LENGTH_SHORT).show()
        }
    }
}