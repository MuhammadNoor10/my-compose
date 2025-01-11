package com.noor.compose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.noor.compose.ui.graphics.FontSize12
import com.noor.compose.ui.graphics.FontSize14
import com.noor.compose.ui.graphics.FontSize16
import com.noor.compose.ui.graphics.FontSize18
import com.noor.compose.ui.graphics.FontSize22
import com.noor.compose.ui.theme.customTextColors

@Composable
fun MyText(
    text: String,
    style: TextStyle,
    onClicked: (Unit) -> Unit = {}
){
    Text(text = text,
        color = style.color,
        fontSize = style.fontSize,
        fontWeight = style.fontWeight,
        modifier = Modifier
            .clickable { onClicked.invoke(Unit) }
    )
}

@Composable
fun TextPrimaryBold22(text: String) {
    MyText(text,
        TextStyle(
            color = MaterialTheme.customTextColors.primary,
            fontSize = FontSize22,
            fontWeight = FontWeight.Bold
        )
    )
}

@Composable
fun TextPrimaryRegular18(text: String) {
    MyText(text, style = TextStyle(
        color = MaterialTheme.customTextColors.primary,
        fontSize = FontSize18
    ))
}

@Composable
fun TextPrimaryRegular16(text: String) {
    MyText(text, style = TextStyle(
        color = MaterialTheme.customTextColors.primary,
        fontSize = FontSize16
    ))
}

@Composable
fun TextPrimaryRegular14(text: String) {
    MyText(text, style = TextStyle(
        color = MaterialTheme.customTextColors.primary,
        fontSize = FontSize14
    ))
}

@Composable
fun TextPrimaryRegular12(text: String) {
    MyText(text, style = TextStyle(
        color = MaterialTheme.customTextColors.primary,
        fontSize = FontSize12
    ))
}

@Composable
fun TextClickablePrimary(text: String, onClicked: (Unit) -> Unit) {
    MyText(text, style = TextStyle(
        color = MaterialTheme.colorScheme.primary,
        fontSize = FontSize12),
        onClicked = onClicked
        )
}

@Composable
fun TextAnnotatedPrimary(onClicked: (Unit) -> Unit) {
    val annotatedText = buildAnnotatedString {
        append("")
        withStyle(SpanStyle(
            color = MaterialTheme.customTextColors.primary
        )
        ) {
            append("Don't have an account? ")
        }

        pushStringAnnotation(tag = "sign_up", annotation = "sign_up")
        withStyle(
            SpanStyle(
                textDecoration = TextDecoration.Underline,
                color = MaterialTheme.colorScheme.primary
            )
        ) {
            append("Sign up now!")
        }
        pop()
    }

    Text(text = annotatedText,
        color = MaterialTheme.colorScheme.primary,
        fontSize = FontSize12,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                annotatedText.getStringAnnotations(tag = "sign_up", start = 23, end = 34).firstOrNull()
                    ?.let {
                        onClicked.invoke(Unit)
                    }
            }
    )
}

@Preview
@Composable
private fun MyTexts(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        TextPrimaryBold22(text = "TextPrimaryRegular22")
        TextPrimaryRegular18(text = "TextPrimaryRegular18")
        TextPrimaryRegular16(text = "TextPrimaryRegular16")
        TextPrimaryRegular14(text = "TextPrimaryRegular14")

        TextAnnotatedPrimary{}
    }
}