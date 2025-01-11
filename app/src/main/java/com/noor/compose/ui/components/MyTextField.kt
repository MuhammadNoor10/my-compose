package com.noor.compose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.noor.compose.ui.graphics.FontSize16
import com.noor.compose.ui.theme.customTextColors

/**
 * Basic
 */
@Composable
fun MyTextField(
    text: String = "",
    label: String,
    textStyle: TextStyle
) {
    var updatedtext by remember { mutableStateOf(text) }

    TextField(value = updatedtext,
        onValueChange = { newText -> updatedtext = newText },
        label = { Text(text = label, color = MaterialTheme.customTextColors.hint, fontSize = TextUnit(14f, TextUnitType.Sp))},
        modifier = Modifier.fillMaxWidth(),
        textStyle = textStyle
    )
}

@Composable
fun TextFieldPrimary(text: String = "", label: String) {
    MyTextField(text, label, TextStyle(MaterialTheme.customTextColors.primary, FontSize16))
}

@Composable
fun TextFieldSecondary(text: String = "", label: String) {
    MyTextField(text, label, TextStyle(MaterialTheme.customTextColors.primary, FontSize16))
}

/**
 * Outlined
 */
@Composable
fun MyTextFieldOutlined(text: String = "", label: String, textStyle: TextStyle){
    var updatedtext by remember { mutableStateOf(text) }

    OutlinedTextField(value = updatedtext,
        onValueChange = { newText -> updatedtext = newText },
        label = { Text(text = label, color = MaterialTheme.customTextColors.hint, fontSize = TextUnit(14f, TextUnitType.Sp))},
        modifier = Modifier.fillMaxWidth(),
        textStyle = textStyle
    )
}

@Composable
fun TextFieldOutlinedPrimary(text: String = "", label: String) {
    MyTextFieldOutlined(text, label, TextStyle(MaterialTheme.customTextColors.primary, FontSize16))
}

@Composable
fun TextFieldOutlinedSecondary(text: String = "", label: String) {
    MyTextFieldOutlined(text, label, TextStyle(MaterialTheme.customTextColors.primary, FontSize16))
}

/**
 * Custom
 */
@Composable
fun MyTextFieldCustom(text: String = "", label: String, textStyle: TextStyle){
    var updatedtext by remember { mutableStateOf(text) }

    OutlinedTextField(value = updatedtext,
        onValueChange = { newText -> updatedtext = newText },
        label = { Text(text = label, color = MaterialTheme.customTextColors.hint, fontSize = TextUnit(14f, TextUnitType.Sp)) },
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        textStyle = textStyle,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = if (updatedtext.isEmpty()) MaterialTheme.customTextColors.textFieldBackgroundColor else Color.White,
            focusedIndicatorColor = MaterialTheme.colorScheme.primary,
            unfocusedIndicatorColor = if (updatedtext.isEmpty()) Color.Transparent else MaterialTheme.customTextColors.textFieldBackgroundColor,
            cursorColor = Color.Black,
            focusedLabelColor = Color.Black,
            unfocusedLabelColor = Color.Gray
        ),
    )
}

@Composable
fun TextFieldCustomPrimary(text: String = "", label: String) {
    MyTextFieldCustom(text, label, TextStyle(MaterialTheme.customTextColors.primary, FontSize16))
}

@Composable
fun TextFieldCustomSecondary(text: String = "", label: String) {
    MyTextFieldCustom(text, label, TextStyle(MaterialTheme.customTextColors.primary, FontSize16))
}

@Preview
@Composable
private fun MyEditTexts(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        //normal
        TextFieldPrimary(label = "Hint Primary TextField")
        TextFieldSecondary(label = "Hint Secondary TextField")

        //outlined
        TextFieldOutlinedPrimary(label = "Hint Primary TextFieldOutlined")
        TextFieldOutlinedSecondary(label = "Hint Secondary TextFieldOutlined")

        //custom
        TextFieldCustomPrimary(text = "Custom Field", label = "Hint Primary TextFieldCustom")
        TextFieldCustomSecondary(label = "Hint Secondary TextFieldCustom")
    }
}