package com.noor.compose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.noor.compose.ui.graphics.Charcoal100
import com.noor.compose.ui.graphics.DisabledPrimaryButton
import com.noor.compose.ui.graphics.PrimaryVariant
import com.noor.compose.ui.graphics.SecondaryColor

@Composable
fun MyButton(text: String, textColor: Color, backgroundColor: Color, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = onClick,
            colors = ButtonColors(backgroundColor, Color.White, DisabledPrimaryButton, Color.Red),
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Text(
                text = text,
                modifier = Modifier,
                color = textColor,
                fontSize = TextUnit(16f, TextUnitType.Sp),
            )
        }
    }
}

@Composable
fun PrimaryButton(text: String, onClick: () -> Unit) {
    MyButton(
        text = text,
        textColor = Color.White,
        backgroundColor = PrimaryVariant,
        onClick
    )
}

@Composable
fun AlternateButton(text: String, onClick: () -> Unit) {
    MyButton(
        text = text,
        textColor = Charcoal100,
        backgroundColor = SecondaryColor,
        onClick
    )
}

@Preview
@Composable
private fun MyButtons(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        PrimaryButton(text = "Primary Button") {}
        AlternateButton(text = "Alternate Button") {}
    }
}