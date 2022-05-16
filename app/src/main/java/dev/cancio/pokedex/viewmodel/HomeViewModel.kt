package dev.cancio.pokedex.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.cancio.pokedex.api.PokemonResponse
import dev.cancio.pokedex.model.Pokemon
import javax.inject.Inject

@HiltViewModel
class HomeViewModel:ViewModel() {
    val homePokemons = PokemonResponse(
        count = 1126,
        next = "https://pokeapi.co/api/v2/pokemon?offset=20&limit=20",
        previous = null,
        results = listOf(
            Pokemon(
                name = "bulbasaur",
                url = "https://pokeapi.co/api/v2/pokemon/1/"
            ),
            Pokemon(
                name = "ivysaur",
                url = "https://pokeapi.co/api/v2/pokemon/2/"
            ),
            Pokemon(
                name = "venusaur",
                url = "https://pokeapi.co/api/v2/pokemon/3/"
            ),
            Pokemon(
                name = "charmander",
                url = "https://pokeapi.co/api/v2/pokemon/4/"
            )
        )
    )
}