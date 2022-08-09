package uz.gita.eventsapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import uz.gita.eventsapp.data.local.dao.EventDao
import uz.gita.eventsapp.data.local.database.EventDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class EventDatabaseModule {

    @[Provides Singleton]
    fun provideEventDatabase(@ApplicationContext context: Context): EventDatabase =
        EventDatabase.getDatabase(context)

    @[Provides Singleton]
    fun provideEventDao(database: EventDatabase) : EventDao = database.eventDao()

}