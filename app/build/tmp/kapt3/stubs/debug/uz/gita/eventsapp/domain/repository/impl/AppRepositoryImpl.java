package uz.gita.eventsapp.domain.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\u0011\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Luz/gita/eventsapp/domain/repository/impl/AppRepositoryImpl;", "Luz/gita/eventsapp/domain/repository/AppRepository;", "eventDao", "Luz/gita/eventsapp/data/local/dao/EventDao;", "(Luz/gita/eventsapp/data/local/dao/EventDao;)V", "allEvents", "", "Luz/gita/eventsapp/data/local/entity/EventEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeEventState", "", "eventId", "", "state", "", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableAllEventStates", "enableAllEventStates", "setInitialEvents", "app_debug"})
public final class AppRepositoryImpl implements uz.gita.eventsapp.domain.repository.AppRepository {
    private final uz.gita.eventsapp.data.local.dao.EventDao eventDao = null;
    
    @javax.inject.Inject()
    public AppRepositoryImpl(@org.jetbrains.annotations.NotNull()
    uz.gita.eventsapp.data.local.dao.EventDao eventDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object allEvents(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<uz.gita.eventsapp.data.local.entity.EventEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object changeEventState(int eventId, boolean state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object enableAllEventStates(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object disableAllEventStates(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.util.List<uz.gita.eventsapp.data.local.entity.EventEntity> setInitialEvents() {
        return null;
    }
}