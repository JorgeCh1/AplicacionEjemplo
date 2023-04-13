package com.example.aplicacionejemplo.dao

import androidx.annotation.RequiresPermission
import androidx.room.*
import com.example.aplicacionejemplo.mibd.tblEstudiante

@Dao
interface dEstudiante {

    @Query("INSERT INTO estudinte {'nombres','apellidos','carrera','año'} VALUES ()")
    fun insertar(estudiante: tblEstudiante)

    @Query("DELETE FROM estudiante WHERE id = :id")
    fun eliminar(id: String)
    @Update
    fun editar(estudiante: tblEstudiante)
    @RequiresPermission.Read
    fun mostrar(estudiante: tblEstudiante)
}