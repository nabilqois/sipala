package com.nabil.sipala

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Gejala(
    val id: String,
    val name: String
) : Parcelable

@Parcelize
data class Premis(
    val listGejala: List<Gejala>
) : Parcelable