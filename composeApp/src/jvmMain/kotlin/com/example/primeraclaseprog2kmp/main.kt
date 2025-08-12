package com.example.primeraclaseprog2kmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "PrimeraClaseProg2KMP",
    ) {
        App()
    }
}