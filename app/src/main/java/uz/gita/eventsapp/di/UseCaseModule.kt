package uz.gita.eventsapp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.eventsapp.domain.usecase.EventsUseCase
import uz.gita.eventsapp.domain.usecase.impl.EventsUseCaseImpl
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
interface UseCaseModule {

    @[Binds Singleton]
    fun bindEventsUseCase(impl: EventsUseCaseImpl): EventsUseCase

}