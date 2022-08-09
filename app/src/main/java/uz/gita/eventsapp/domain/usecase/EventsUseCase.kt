package uz.gita.eventsapp.domain.usecase

import kotlinx.coroutines.flow.Flow
import uz.gita.eventsapp.data.local.model.EventData

interface EventsUseCase {

    fun allEvents(): Flow<List<EventData>>

    fun changeEventState(eventId: Int, state: Boolean): Flow<List<EventData>>

    fun enableAllEventStates(): Flow<List<EventData>>

    fun disableAllEventStates(): Flow<List<EventData>>

}