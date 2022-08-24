package dev.ygordoring.apipkmn.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PokemonResponse(
        val results: List<PokemonApiResult>
) : Parcelable