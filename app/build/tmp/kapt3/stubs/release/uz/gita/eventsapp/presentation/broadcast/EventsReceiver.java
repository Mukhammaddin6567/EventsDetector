package uz.gita.eventsapp.presentation.broadcast;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u001c\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Luz/gita/eventsapp/presentation/broadcast/EventsReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "eventDao", "Luz/gita/eventsapp/data/local/dao/EventDao;", "getEventDao", "()Luz/gita/eventsapp/data/local/dao/EventDao;", "setEventDao", "(Luz/gita/eventsapp/data/local/dao/EventDao;)V", "mediaPlayer", "Landroid/media/MediaPlayer;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "clearReceiver", "", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_release"})
@dagger.hilt.android.AndroidEntryPoint()
public final class EventsReceiver extends android.content.BroadcastReceiver {
    private android.media.MediaPlayer mediaPlayer;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @javax.inject.Inject()
    public uz.gita.eventsapp.data.local.dao.EventDao eventDao;
    
    public EventsReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final uz.gita.eventsapp.data.local.dao.EventDao getEventDao() {
        return null;
    }
    
    public final void setEventDao(@org.jetbrains.annotations.NotNull()
    uz.gita.eventsapp.data.local.dao.EventDao p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    public final void clearReceiver() {
    }
}