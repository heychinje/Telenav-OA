package com.telenav.telenavoa.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.WindowSizeClass

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.telenav.telenavoa.Greeting
import com.telenav.telenavoa.ui.theme.TelenavOATheme

@Composable
fun TelenavOaApp(windowSizeClass: WindowSizeClass) {
    TelenavOATheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting("Android")
        }
    }
}