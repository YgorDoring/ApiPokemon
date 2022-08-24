package dev.ygordoring.apipkmn.network


import dev.ygordoring.apipkmn.model.PokemonResponse

import retrofit2.http.GET


interface PokemonApi {
@GET("pokemon.json")
suspend  fun getPokemons(): PokemonResponse

}

