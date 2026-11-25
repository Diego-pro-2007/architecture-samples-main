/*
 * Copyright 2023 The Android Open Source Project
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
 *  Archivo  : LocalTask.kt
 *  Autor(es): Gonzalez Diego Alejandro  &  Garcia Mata Hashly Regina
 *  Rol      : ROOM · ENTITY: define la TABLA 'task' de la base de datos local.
 *             Cada propiedad de esta clase es una columna de la tabla.
 *  Arquitectura: MVVM + Repository + Room (local) + Hilt + Jetpack Compose
 *    UI (Compose)  ->  ViewModel  ->  Repository  ->  Room (DAO / base de datos)
 * ================================================================================
 */

package com.example.android.architecture.blueprints.todoapp.data.source.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Internal model used to represent a task stored locally in a Room database. This is used inside
 * the data layer only.
 *
 * See ModelMappingExt.kt for mapping functions used to convert this model to other
 * models.
 */
// @Entity = esta clase es una tabla. @PrimaryKey = columna que identifica de forma única cada fila
@Entity(
    tableName = "task"
)
data class LocalTask(
    @PrimaryKey val id: String,
    var title: String,
    var description: String,
    var isCompleted: Boolean,
)
