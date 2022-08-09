package uz.gita.eventsapp.presentation.viewmodel.impl;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\"\u001a\u00020\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\b\u0010$\u001a\u00020\u0015H\u0002J\b\u0010%\u001a\u00020\u0015H\u0016J\b\u0010&\u001a\u00020\u0015H\u0016J\b\u0010\'\u001a\u00020\u0015H\u0016J\u0018\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u0015H\u0016J\b\u0010-\u001a\u00020\u0015H\u0016J\b\u0010.\u001a\u00020\u0015H\u0016R1\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\'\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0012\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0016\u0010\fR!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0019\u0010\fR!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001c\u0010\fR!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b \u0010\f\u00a8\u0006/"}, d2 = {"Luz/gita/eventsapp/presentation/viewmodel/impl/EventsViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/eventsapp/presentation/viewmodel/EventsViewModel;", "eventsUseCase", "Luz/gita/eventsapp/domain/usecase/EventsUseCase;", "(Luz/gita/eventsapp/domain/usecase/EventsUseCase;)V", "allActionsLiveData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getAllActionsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "allActionsLiveData$delegate", "Lkotlin/Lazy;", "allEventsLiveData", "", "Luz/gita/eventsapp/data/local/model/EventData;", "getAllEventsLiveData", "allEventsLiveData$delegate", "navigateRateScreenLiveData", "", "getNavigateRateScreenLiveData", "navigateRateScreenLiveData$delegate", "quitAppLiveData", "getQuitAppLiveData", "quitAppLiveData$delegate", "showDialogLiveData", "getShowDialogLiveData", "showDialogLiveData$delegate", "showShareDialogLiveData", "", "getShowShareDialogLiveData", "showShareDialogLiveData$delegate", "loadAllActions", "list", "loadAllEvents", "onClickButtonMore", "onClickDisableAllActionsButton", "onClickEnableAllActionsButton", "onClickEventChange", "eventId", "state", "", "onClickQuitAppButton", "onClickRateButton", "onClickShareButton", "app_release"})
public final class EventsViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.eventsapp.presentation.viewmodel.EventsViewModel {
    private final uz.gita.eventsapp.domain.usecase.EventsUseCase eventsUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy allActionsLiveData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy allEventsLiveData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy showDialogLiveData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy showShareDialogLiveData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy navigateRateScreenLiveData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy quitAppLiveData$delegate = null;
    
    @javax.inject.Inject()
    public EventsViewModelImpl(@org.jetbrains.annotations.NotNull()
    uz.gita.eventsapp.domain.usecase.EventsUseCase eventsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getAllActionsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.eventsapp.data.local.model.EventData>> getAllEventsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getShowDialogLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.lang.Integer> getShowShareDialogLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getNavigateRateScreenLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getQuitAppLiveData() {
        return null;
    }
    
    @java.lang.Override()
    public void onClickButtonMore() {
    }
    
    @java.lang.Override()
    public void onClickEventChange(int eventId, boolean state) {
    }
    
    @java.lang.Override()
    public void onClickEnableAllActionsButton() {
    }
    
    @java.lang.Override()
    public void onClickDisableAllActionsButton() {
    }
    
    @java.lang.Override()
    public void onClickShareButton() {
    }
    
    @java.lang.Override()
    public void onClickRateButton() {
    }
    
    @java.lang.Override()
    public void onClickQuitAppButton() {
    }
    
    private final void loadAllEvents() {
    }
    
    private final void loadAllActions(java.util.List<uz.gita.eventsapp.data.local.model.EventData> list) {
    }
}