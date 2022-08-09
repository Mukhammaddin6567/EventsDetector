package uz.gita.eventsapp.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0017\u001a\u00020\u000eH&J\b\u0010\u0018\u001a\u00020\u000eH&J\b\u0010\u0019\u001a\u00020\u000eH&J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u000eH&J\b\u0010\u001f\u001a\u00020\u000eH&J\b\u0010 \u001a\u00020\u000eH&R(\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\bR\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\bR\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\b\u00a8\u0006!"}, d2 = {"Luz/gita/eventsapp/presentation/viewmodel/EventsViewModel;", "", "allActionsLiveData", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getAllActionsLiveData", "()Landroidx/lifecycle/LiveData;", "allEventsLiveData", "", "Luz/gita/eventsapp/data/local/model/EventData;", "getAllEventsLiveData", "navigateRateScreenLiveData", "", "getNavigateRateScreenLiveData", "quitAppLiveData", "getQuitAppLiveData", "showDialogLiveData", "getShowDialogLiveData", "showShareDialogLiveData", "", "getShowShareDialogLiveData", "onClickButtonMore", "onClickDisableAllActionsButton", "onClickEnableAllActionsButton", "onClickEventChange", "eventId", "state", "", "onClickQuitAppButton", "onClickRateButton", "onClickShareButton", "app_release"})
public abstract interface EventsViewModel {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.ArrayList<java.lang.String>> getAllActionsLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<uz.gita.eventsapp.data.local.model.EventData>> getAllEventsLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getShowDialogLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getShowShareDialogLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getNavigateRateScreenLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getQuitAppLiveData();
    
    public abstract void onClickButtonMore();
    
    public abstract void onClickEventChange(int eventId, boolean state);
    
    public abstract void onClickEnableAllActionsButton();
    
    public abstract void onClickDisableAllActionsButton();
    
    public abstract void onClickShareButton();
    
    public abstract void onClickRateButton();
    
    public abstract void onClickQuitAppButton();
}