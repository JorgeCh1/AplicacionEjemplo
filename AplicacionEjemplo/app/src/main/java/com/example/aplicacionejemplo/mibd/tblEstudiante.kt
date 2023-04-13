package com.example.aplicacionejemplo.mibd

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class tblEstudiante(
    @PrimaryKey
    val id: String,
    val nombres: String,
    val apellidos: String,
    val carrera: String,
    val año: String
)