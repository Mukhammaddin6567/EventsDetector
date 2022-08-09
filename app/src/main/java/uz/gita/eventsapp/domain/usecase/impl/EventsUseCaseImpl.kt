package uz.gita.eventsapp.domain.usecase.impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import uz.gita.eventsapp.data.local.model.EventData
import uz.gita.eventsapp.domain.repository.AppRepository
import uz.gita.eventsapp.domain.usecase.EventsUseCase
import javax.inject.Inject

class EventsUseCaseImpl
@Inject constructor(
    private val repository: AppRepository
) : EventsUseCase {

    override fun allEvents() = flow<List<EventData>> {
        val result = repository.allEvents().map { it.eventEntityToEventData() }
        emit(result)
    }.flowOn(Dispatchers.IO)

    override fun changeEventState(eventId: Int, state: Boolean) = flow<List<EventData>> {
        repository.changeEventState(eventId, state)
        val result = repository.allEvents().map { it.eventEntityToEventData() }
        emit(result)
    }.flowOn(Dispatchers.IO)

    override fun enableAllEventStates() = flow<List<EventData>> {
        repository.enableAllEventStates()
        val result = repository.allEvents().map { it.eventEntityToEventData() }
        emit(result)
    }.flowOn(Dispatchers.IO)

    override fun disableAllEventStates() = flow<List<EventData>> {
        repository.disableAllEventStates()
        val result = repository.allEvents().map { it.eventEntityToEventData() }
        emit(result)
    }.flowOn(Dispatchers.IO)

}