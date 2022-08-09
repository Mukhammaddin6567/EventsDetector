package uz.gita.eventsapp.domain.repository

import uz.gita.eventsapp.data.local.entity.EventEntity

interface AppRepository {

    suspend fun allEvents(): List<EventEntity>

    suspend fun changeEventState(eventId: Int, state: Boolean)

    suspend fun enableAllEventStates()

    suspend fun disableAllEventStates()

}