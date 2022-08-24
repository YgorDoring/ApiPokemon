package dev.ygordoring.apipkmn.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PokemonDetails(
    @SerializedName("order")
    val id: Int,
    @SerializedName("stats")
    val status:  List<PokemonStatus>,
    val types:  List<PokemonTypes>,
    val name: String,
    val height: Double,
    val weight: Double,
): Parcelable
