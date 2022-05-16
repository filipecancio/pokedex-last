package dev.cancio.pokedex.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.cancio.pokedex.PokedexApplication
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PokedexModule {
    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app: Context):PokedexApplication{
        return app as PokedexApplication
    }
}