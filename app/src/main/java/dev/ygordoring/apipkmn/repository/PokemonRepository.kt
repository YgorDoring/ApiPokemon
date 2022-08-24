package dev.ygordoring.apipkmn.repository


import dev.ygordoring.apipkmn.model.PokemonResponse

interface PokemonRepository {
suspend fun requestPokemons() : PokemonResponse

}