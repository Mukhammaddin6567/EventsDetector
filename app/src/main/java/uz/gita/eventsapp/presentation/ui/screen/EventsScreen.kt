package uz.gita.eventsapp.presentation.ui.screen

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import uz.gita.eventsapp.R
import uz.gita.eventsapp.data.local.model.EventData
import uz.gita.eventsapp.databinding.ScreenEventsBinding
import uz.gita.eventsapp.presentation.ui.adapter.EventsAdapter
import uz.gita.eventsapp.presentation.broadcast.EventsReceiver
import uz.gita.eventsapp.presentation.ui.dialog.EventDialog
import uz.gita.eventsapp.presentation.service.EventsService
import uz.gita.eventsapp.presentation.viewmodel.EventsViewModel
import uz.gita.eventsapp.presentation.viewmodel.impl.EventsViewModelImpl

@AndroidEntryPoint
class EventsScreen : Fragment(R.layout.screen_events) {
    private val viewBinding by viewBinding(ScreenEventsBinding::bind)
    private val viewModel: EventsViewModel by viewModels<EventsViewModelImpl>()
    private val adapter: EventsAdapter by lazy { EventsAdapter() }
    private val eventsReceiver: EventsReceiver by lazy { EventsReceiver() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        subscribeViewModel(viewModel)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        subscribeViewBinding(viewBinding)
        subscribeViewModel(viewModel)
    }

    private fun subscribeViewBinding(viewBinding: ScreenEventsBinding) = with(viewBinding) {
        (requireActivity() as AppCompatActivity).setSupportActionBar(toolbar)
        listEvents.adapter = adapter
        listEvents.layoutManager = LinearLayoutManager(requireContext())
        adapter.setOnEventStateChangeListener { eventId, eventState ->
            Timber.d("setOnEventStateChangeListener: $eventState")
            viewModel.onClickEventChange(eventId, eventState)
        }
    }

    @SuppressLint("FragmentLiveDataObserve")
    private fun subscribeViewModel(viewModel: EventsViewModel) = with(viewModel) {
        allEventsLiveData.observe(this@EventsScreen, allEventsLiveDataObserver)
        allActionsLiveData.observe(this@EventsScreen, allActionsLiveDataObserver)
        showDialogLiveData.observe(this@EventsScreen, showDialogLiveDataObserver)
        showShareDialogLiveData.observe(this@EventsScreen, showShareDialogLiveDataObserver)
        navigateRateScreenLiveData.observe(
            this@EventsScreen,
            navigateRateScreenLiveDataObserver
        )
        quitAppLiveData.observe(this@EventsScreen, quitAppLiveDataObserver)
    }

    private val allEventsLiveDataObserver = Observer<List<EventData>> { list ->
        adapter.submitList(list)
    }


    private val allActionsLiveDataObserver = Observer<ArrayList<String>> { allActions ->
        Timber.d("enabledActionsLiveDataObserver: $allActions")
        val intent = Intent(requireContext(), EventsService::class.java)
        intent.putStringArrayListExtra("enabledActions", allActions)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            requireActivity().startForegroundService(intent)
        else requireActivity().startService(intent)
    }

    private val showDialogLiveDataObserver = Observer<Unit> {
        val dialog = EventDialog()
        dialog.setOnClickEnableAllEventsListener { viewModel.onClickEnableAllActionsButton() }
        dialog.setOnClickDisableAllEventsListener { viewModel.onClickDisableAllActionsButton() }
        dialog.setOnClickRateListener { viewModel.onClickRateButton() }
        dialog.setOnClickShareListener { viewModel.onClickShareButton() }
        dialog.setOnClickQuitAppListener { viewModel.onClickQuitAppButton() }
        dialog.show(childFragmentManager, "EventDialog")
    }

    private val showShareDialogLiveDataObserver = Observer<Int> { title ->
        val appPackageName = requireContext().packageName
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.putExtra(
            Intent.EXTRA_TEXT,
            "Let me recommend you this application: https://play.google.com/store/apps/details?id=$appPackageName"
        )
        intent.type = "text/plain"
        requireContext().startActivity(Intent.createChooser(intent, resources.getString(title)))
    }

    private val navigateRateScreenLiveDataObserver = Observer<Unit> {
        val appPackageName = requireContext().packageName
        val intent = Intent()
        intent.action = Intent.ACTION_VIEW
        intent.data = Uri.parse("market://details?id=$appPackageName")
        requireContext().startActivity(intent)
    }

    private val quitAppLiveDataObserver = Observer<Unit> {
        requireContext().stopService(
            Intent(
                requireContext(),
                EventsService::class.java
            )
        )
        requireActivity().finish()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.clear()
        inflater.inflate(R.menu.menu_toolbar, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menuMore -> {
                viewModel.onClickButtonMore()
                true
            }
            else -> false
        }
    }
}