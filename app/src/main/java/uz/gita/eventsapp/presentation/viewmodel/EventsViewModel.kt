package uz.gita.eventsapp.presentation.viewmodel

import androidx.lifecycle.LiveData
import uz.gita.eventsapp.data.local.model.EventData

interface EventsViewModel {

    val allActionsLiveData: LiveData<ArrayList<String>>
    val allEventsLiveData: LiveData<List<EventData>>
    val showDialogLiveData: LiveData<Unit>
    val showShareDialogLiveData: LiveData<Int>
    val navigateRateScreenLiveData: LiveData<Unit>
    val quitAppLiveData: LiveData<Unit>

    fun onClickButtonMore()
    fun onClickEventChange(eventId: Int, state: Boolean)
    fun onClickEnableAllActionsButton()
    fun onClickDisableAllActionsButton()
    fun onClickShareButton()
    fun onClickRateButton()
    fun onClickQuitAppButton()

}