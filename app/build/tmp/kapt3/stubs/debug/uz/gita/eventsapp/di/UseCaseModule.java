package uz.gita.eventsapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Luz/gita/eventsapp/di/UseCaseModule;", "", "bindEventsUseCase", "Luz/gita/eventsapp/domain/usecase/EventsUseCase;", "impl", "Luz/gita/eventsapp/domain/usecase/impl/EventsUseCaseImpl;", "app_debug"})
@dagger.Module()
public abstract interface UseCaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract uz.gita.eventsapp.domain.usecase.EventsUseCase bindEventsUseCase(@org.jetbrains.annotations.NotNull()
    uz.gita.eventsapp.domain.usecase.impl.EventsUseCaseImpl impl);
}