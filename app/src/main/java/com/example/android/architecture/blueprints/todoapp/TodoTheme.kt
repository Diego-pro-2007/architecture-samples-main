/*
 * ================================================================================
 *  ToDoApp  ·  U4RA7 - Resultado de Aprendizaje #7  ·  Grupo 4E
 *  Archivo  : TodoTheme.kt
 *  Autor(es): Gonzalez Diego Alejandro  &  Garcia Mata Hashly Regina
 *  Rol      : Tema visual (colores) de toda la app. Aquí se personalizó la paleta.
 *  Arquitectura: MVVM + Repository + Room (local) + Hilt + Jetpack Compose
 *    UI (Compose)  ->  ViewModel  ->  Repository  ->  Room (DAO / base de datos)
 * ================================================================================
 */

package com.example.android.architecture.blueprints.todoapp

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/**
 * Tema visual de la app (Material 3).
 *
 * Aquí se define la paleta de colores personalizada:
 *  - primary   -> morado profundo (barra superior, encabezado del menú)
 *  - secondary -> verde azulado (botón +, barra de progreso, ítem seleccionado)
 *  - background/surface -> lila muy claro para que las tarjetas resalten
 */
@Composable
fun TodoTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = Color(0xFF4527A0),
            onPrimary = Color(0xFFFFFFFF),
            primaryContainer = Color(0xFFE8DEF8),
            secondary = Color(0xFF00897B),
            onSecondary = Color(0xFFFFFFFF),
            tertiary = Color(0xFFB39DDB),
            background = Color(0xFFF6F3FF),
            surface = Color(0xFFFFFFFF),
            surfaceVariant = Color(0xFFE6E0F5),
        )
    ) {
        content()
    }
}
