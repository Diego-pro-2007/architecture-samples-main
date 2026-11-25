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
 *  Archivo  : ToDoDatabase.kt
 *  Autor(es): Gonzalez Diego Alejandro  &  Garcia Mata Hashly Regina
 *  Rol      : ROOM · DATABASE: clase principal de la base de datos local (SQLite).
 *             Lista las entidades (tablas) y expone el DAO.
 *  Arquitectura: MVVM + Repository + Room (local) + Hilt + Jetpack Compose
 *    UI (Compose)  ->  ViewModel  ->  Repository  ->  Room (DAO / base de datos)
 * ================================================================================
 */

package com.example.android.architecture.blueprints.todoapp.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * The Room Database that contains the Task table.
 *
 * Note that exportSchema should be true in production databases.
 */
// version = 1: si algún día cambia la estructura de la tabla hay que subir la versión (migración)
@Database(entities = [LocalTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao
}
