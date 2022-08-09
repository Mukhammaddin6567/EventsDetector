package uz.gita.eventsapp.presentation.broadcast;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = EventsReceiver.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface EventsReceiver_GeneratedInjector {
  void injectEventsReceiver(EventsReceiver eventsReceiver);
}
