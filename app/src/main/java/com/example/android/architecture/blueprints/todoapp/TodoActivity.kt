    /*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * ================================================================================
 *  ToDoApp  ·  U4RA7 - Resultado de Aprendizaje #7  ·  Grupo 4E
 *  Archivo  : TodoActivity.kt
 *  Autor(es): Gonzalez Diego Alejandro  &  Garcia Mata Hashly Regina
 *  Rol      : PUNTO DE ENTRADA de la app (única Activity).
 *             Android abre esta Activity al tocar el ícono de la app.
 *             setContent { } pone la interfaz hecha con Jetpack Compose.
 *             @AndroidEntryPoint permite que Hilt le inyecte dependencias.
 *  Arquitectura: MVVM + Repository + Room (local) + Hilt + Jetpack Compose
 *    UI (Compose)  ->  ViewModel  ->  Repository  ->  Room (DAO / base de datos)
 * ================================================================================
 */

package com.example.android.architecture.blueprints.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint

/**
 * Main Activity for the ToDoApp
 *
 * Es la única Activity: el resto de "pantallas" son @Composable dentro de [TodoNavGraph].
 */
@AndroidEntryPoint
class TodoActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Dibuja la app detrás de la barra de estado y la de navegación (pantalla completa)
        enableEdgeToEdge()
        // Aquí empieza la interfaz Compose: primero el tema (colores) y luego la navegación
        setContent {
            TodoTheme {
                TodoNavGraph()
            }
        }
    }
}
