package com.example.final_project_psi
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Recipe (
    val photo: Int,
    val name: String,
    val category: String,
    val creator: String,
    val ingridients: String
        ): Parcelable