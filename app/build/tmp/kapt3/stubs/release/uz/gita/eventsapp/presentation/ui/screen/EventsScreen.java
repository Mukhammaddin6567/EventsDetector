package uz.gita.eventsapp.presentation.ui.screen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010&\u001a\u00020\u00162\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0018\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\u001a\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u0002042\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u00105\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u00106\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0003R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\b\u001a\u0004\b#\u0010$\u00a8\u00067"}, d2 = {"Luz/gita/eventsapp/presentation/ui/screen/EventsScreen;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Luz/gita/eventsapp/presentation/ui/adapter/EventsAdapter;", "getAdapter", "()Luz/gita/eventsapp/presentation/ui/adapter/EventsAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "allActionsLiveDataObserver", "Landroidx/lifecycle/Observer;", "Ljava/util/ArrayList;", "", "allEventsLiveDataObserver", "", "Luz/gita/eventsapp/data/local/model/EventData;", "eventsReceiver", "Luz/gita/eventsapp/presentation/broadcast/EventsReceiver;", "getEventsReceiver", "()Luz/gita/eventsapp/presentation/broadcast/EventsReceiver;", "eventsReceiver$delegate", "navigateRateScreenLiveDataObserver", "", "quitAppLiveDataObserver", "showDialogLiveDataObserver", "showShareDialogLiveDataObserver", "", "viewBinding", "Luz/gita/eventsapp/databinding/ScreenEventsBinding;", "getViewBinding", "()Luz/gita/eventsapp/databinding/ScreenEventsBinding;", "viewBinding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewModel", "Luz/gita/eventsapp/presentation/viewmodel/EventsViewModel;", "getViewModel", "()Luz/gita/eventsapp/presentation/viewmodel/EventsViewModel;", "viewModel$delegate", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "Landroid/view/View;", "subscribeViewBinding", "subscribeViewModel", "app_release"})
@dagger.hilt.android.AndroidEntryPoint()
public final class EventsScreen extends androidx.fragment.app.Fragment {
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty viewBinding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy adapter$delegate = null;
    private final kotlin.Lazy eventsReceiver$delegate = null;
    private final androidx.lifecycle.Observer<java.util.List<uz.gita.eventsapp.data.local.model.EventData>> allEventsLiveDataObserver = null;
    private final androidx.lifecycle.Observer<java.util.ArrayList<java.lang.String>> allActionsLiveDataObserver = null;
    private final androidx.lifecycle.Observer<kotlin.Unit> showDialogLiveDataObserver = null;
    private final androidx.lifecycle.Observer<java.lang.Integer> showShareDialogLiveDataObserver = null;
    private final androidx.lifecycle.Observer<kotlin.Unit> navigateRateScreenLiveDataObserver = null;
    private final androidx.lifecycle.Observer<kotlin.Unit> quitAppLiveDataObserver = null;
    
    public EventsScreen() {
        super();
    }
    
    private final uz.gita.eventsapp.databinding.ScreenEventsBinding getViewBinding() {
        return null;
    }
    
    private final uz.gita.eventsapp.presentation.viewmodel.EventsViewModel getViewModel() {
        return null;
    }
    
    private final uz.gita.eventsapp.presentation.ui.adapter.EventsAdapter getAdapter() {
        return null;
    }
    
    private final uz.gita.eventsapp.presentation.broadcast.EventsReceiver getEventsReceiver() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeViewBinding(uz.gita.eventsapp.databinding.ScreenEventsBinding viewBinding) {
    }
    
    @android.annotation.SuppressLint(value = {"FragmentLiveDataObserve"})
    private final void subscribeViewModel(uz.gita.eventsapp.presentation.viewmodel.EventsViewModel viewModel) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
}