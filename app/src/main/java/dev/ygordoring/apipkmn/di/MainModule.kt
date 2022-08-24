 package dev.ygordoring.apipkmn.di



import dev.ygordoring.apipkmn.network.PokemonApi
import dev.ygordoring.apipkmn.repository.PokemonRepository
import dev.ygordoring.apipkmn.repository.PokemonRepositoryImplem
import dev.ygordoring.apipkmn.viewModel.PokemonViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val mainModule = module{

    single { Retrofit.Builder()
        .baseUrl("https://amgui.github.io/pokemon-data/")
        .addConverterFactory(GsonConverterFactory.create())
        .build() }

    single  {
        get<Retrofit>().create(PokemonApi::class.java)
   }
    factory<PokemonRepository> {
        PokemonRepositoryImplem(pokemonApi = get())
    }

    viewModel {
        PokemonViewModel(
           repositoryImplem = get()
        )

    }
}