package uz.gita.eventsapp.domain.usecase.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Luz/gita/eventsapp/domain/usecase/impl/EventsUseCaseImpl;", "Luz/gita/eventsapp/domain/usecase/EventsUseCase;", "repository", "Luz/gita/eventsapp/domain/repository/AppRepository;", "(Luz/gita/eventsapp/domain/repository/AppRepository;)V", "allEvents", "Lkotlinx/coroutines/flow/Flow;", "", "Luz/gita/eventsapp/data/local/model/EventData;", "changeEventState", "eventId", "", "state", "", "disableAllEventStates", "enableAllEventStates", "app_debug"})
public final class EventsUseCaseImpl implements uz.gita.eventsapp.domain.usecase.EventsUseCase {
    private final uz.gita.eventsapp.domain.repository.AppRepository repository = null;
    
    @javax.inject.Inject()
    public EventsUseCaseImpl(@org.jetbrains.annotations.NotNull()
    uz.gita.eventsapp.domain.repository.AppRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.eventsapp.data.local.model.EventData>> allEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.eventsapp.data.local.model.EventData>> changeEventState(int eventId, boolean state) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.eventsapp.data.local.model.EventData>> enableAllEventStates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.eventsapp.data.local.model.EventData>> disableAllEventStates() {
        return null;
    }
}