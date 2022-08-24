package dev.ygordoring.apipkmn.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PokemonTypes(
        val slot: Int,
        val type: Tipo
        ): Parcelable
