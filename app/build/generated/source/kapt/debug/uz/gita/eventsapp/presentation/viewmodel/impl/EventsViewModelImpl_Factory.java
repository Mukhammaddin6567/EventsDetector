// Generated by Dagger (https://dagger.dev).
package uz.gita.eventsapp.presentation.viewmodel.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import uz.gita.eventsapp.domain.usecase.EventsUseCase;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class EventsViewModelImpl_Factory implements Factory<EventsViewModelImpl> {
  private final Provider<EventsUseCase> eventsUseCaseProvider;

  public EventsViewModelImpl_Factory(Provider<EventsUseCase> eventsUseCaseProvider) {
    this.eventsUseCaseProvider = eventsUseCaseProvider;
  }

  @Override
  public EventsViewModelImpl get() {
    return newInstance(eventsUseCaseProvider.get());
  }

  public static EventsViewModelImpl_Factory create(Provider<EventsUseCase> eventsUseCaseProvider) {
    return new EventsViewModelImpl_Factory(eventsUseCaseProvider);
  }

  public static EventsViewModelImpl newInstance(EventsUseCase eventsUseCase) {
    return new EventsViewModelImpl(eventsUseCase);
  }
}
