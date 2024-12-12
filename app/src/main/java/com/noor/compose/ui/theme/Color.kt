package com.noor.compose.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Define individual colors
val PrimaryColor = Color(0xFF0182AA)
val PrimaryVariant = Color(0xFF00539F)
val SecondaryColor = Color(0xFFFBD012)
val BackgroundColor = Color(0xFFFFFFFF)
val SurfaceColor = Color(0xFFEEEEEE)
val ErrorColor = Color(0xFFB00020)

// Light Theme Palette
val LightColors = lightColorScheme(
    primary = PrimaryColor,
    primaryContainer = PrimaryVariant,
    secondary = SecondaryColor,
    background = BackgroundColor,
    surface = SurfaceColor,
    error = ErrorColor,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    onError = Color.White
)

// Dark Theme Palette
val DarkColors = darkColorScheme(
    primary = PrimaryColor,
    primaryContainer = PrimaryVariant,
    secondary = SecondaryColor,
    background = Color.Black,
    surface = Color.DarkGray,
    error = ErrorColor,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
    onError = Color.Black
)