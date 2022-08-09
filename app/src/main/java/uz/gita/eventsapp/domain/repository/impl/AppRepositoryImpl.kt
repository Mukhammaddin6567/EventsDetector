package uz.gita.eventsapp.domain.repository.impl

import android.content.Intent
import uz.gita.eventsapp.R
import uz.gita.eventsapp.data.local.dao.EventDao
import uz.gita.eventsapp.data.local.entity.EventEntity
import uz.gita.eventsapp.domain.repository.AppRepository
import javax.inject.Inject

class AppRepositoryImpl
@Inject constructor(
    private val eventDao: EventDao
) : AppRepository {

    override suspend fun allEvents(): List<EventEntity> {
        if (!eventDao.isAvailableEvents()) eventDao.insertInitialEvents(setInitialEvents())
        return eventDao.getAllEvents()
    }

    override suspend fun changeEventState(eventId: Int, state: Boolean) =
        eventDao.changeEventState(eventId, state)

    override suspend fun enableAllEventStates() = eventDao.enableAllEventStates()

    override suspend fun disableAllEventStates() = eventDao.disableAllEventStates()

    private fun setInitialEvents(): List<EventEntity> {
        return listOf(
            EventEntity(
                id = 1,
                actionIcon = R.drawable.ic_screen_on,
                action = Intent.ACTION_SCREEN_ON,
                actionName = R.string.text_screen_on
            ),
            EventEntity(
                id = 2,
                actionIcon = R.drawable.ic_screen_off,
                action = Intent.ACTION_SCREEN_OFF,
                actionName = R.string.text_screen_off
            ),
            EventEntity(
                id = 3,
                actionIcon = R.drawable.ic_connected,
                action = Intent.ACTION_POWER_CONNECTED,
                actionName = R.string.text_power_connected
            ),
            EventEntity(
                id = 4,
                actionIcon = R.drawable.ic_disconnected,
                action = Intent.ACTION_POWER_DISCONNECTED,
                actionName = R.string.text_power_disconnected
            ),
            EventEntity(
                id = 5,
                actionIcon = R.drawable.ic_battery_ok,
                action = Intent.ACTION_BATTERY_OKAY,
                actionName = R.string.text_battery_okay
            ),
            EventEntity(
                id = 6,
                actionIcon = R.drawable.ic_battery_low,
                action = Intent.ACTION_BATTERY_LOW,
                actionName = R.string.text_battery_low
            ),
            EventEntity(
                id = 7,
                actionIcon = R.drawable.ic_airplane,
                action = Intent.ACTION_AIRPLANE_MODE_CHANGED,
                actionName = R.string.text_airplane
            ),
        )
    }

}