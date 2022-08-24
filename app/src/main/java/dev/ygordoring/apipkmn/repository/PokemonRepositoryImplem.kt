package dev.ygordoring.apipkmn.repository

import android.util.Log
import dev.ygordoring.apipkmn.model.PokemonResponse

import dev.ygordoring.apipkmn.network.PokemonApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PokemonRepositoryImplem(private val pokemonApi: PokemonApi):PokemonRepository {
    override suspend fun requestPokemons(): PokemonResponse {
        return try {
            val response = withContext(Dispatchers.IO) {
                pokemonApi.getPokemons()
            }
            response

        } catch (e: Exception) {
            Log.d("Erro", "Crash pokemon")
            throw e

        }

    }


}


