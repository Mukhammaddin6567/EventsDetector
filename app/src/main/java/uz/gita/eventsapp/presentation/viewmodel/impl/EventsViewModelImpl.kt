package uz.gita.eventsapp.presentation.viewmodel.impl

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.eventsapp.R
import uz.gita.eventsapp.data.local.model.EventData
import uz.gita.eventsapp.domain.usecase.EventsUseCase
import uz.gita.eventsapp.presentation.viewmodel.EventsViewModel
import javax.inject.Inject

@HiltViewModel
class EventsViewModelImpl
@Inject constructor(
    private val eventsUseCase: EventsUseCase
) : ViewModel(), EventsViewModel {

    override val allActionsLiveData: MutableLiveData<ArrayList<String>> by lazy { MutableLiveData<ArrayList<String>>() }
    override val allEventsLiveData: MutableLiveData<List<EventData>> by lazy { MutableLiveData<List<EventData>>() }
    override val showDialogLiveData: MutableLiveData<Unit> by lazy { MutableLiveData<Unit>() }
    override val showShareDialogLiveData: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    override val navigateRateScreenLiveData: MutableLiveData<Unit> by lazy { MutableLiveData<Unit>() }
    override val quitAppLiveData: MutableLiveData<Unit> by lazy { MutableLiveData<Unit>() }

    init {
        loadAllEvents()
    }

    override fun onClickButtonMore() {
        showDialogLiveData.value = Unit
    }

    override fun onClickEventChange(eventId: Int, state: Boolean) {
        eventsUseCase
            .changeEventState(eventId, state)
            .onEach { list -> allEventsLiveData.value = list; loadAllActions(list) }
            .launchIn(viewModelScope)
    }

    override fun onClickEnableAllActionsButton() {
        eventsUseCase
            .enableAllEventStates()
            .onEach { list -> allEventsLiveData.value = list; loadAllActions(list) }
            .launchIn(viewModelScope)
    }

    override fun onClickDisableAllActionsButton() {
        eventsUseCase
            .disableAllEventStates()
            .onEach { list -> allEventsLiveData.value = list; loadAllActions(list) }
            .launchIn(viewModelScope)
    }

    override fun onClickShareButton() {
        showShareDialogLiveData.value = R.string.text_share_title
    }

    override fun onClickRateButton() {
        navigateRateScreenLiveData.value = Unit
    }

    override fun onClickQuitAppButton() {
        quitAppLiveData.value = Unit
    }

    private fun loadAllEvents() {
        eventsUseCase
            .allEvents()
            .onEach { list -> allEventsLiveData.value = list; loadAllActions(list) }
            .launchIn(viewModelScope)
    }

    private fun loadAllActions(list: List<EventData>) {
        val allActions = ArrayList<String>()
        list.forEach { eventData -> allActions.add(eventData.action) }
        allActionsLiveData.value = allActions
    }

}