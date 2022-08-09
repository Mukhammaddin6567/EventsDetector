package uz.gita.eventsapp.data.local.database;

import java.lang.System;

@androidx.room.Database(entities = {uz.gita.eventsapp.data.local.entity.EventEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Luz/gita/eventsapp/data/local/database/EventDatabase;", "Landroidx/room/RoomDatabase;", "()V", "eventDao", "Luz/gita/eventsapp/data/local/dao/EventDao;", "Companion", "app_release"})
public abstract class EventDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final uz.gita.eventsapp.data.local.database.EventDatabase.Companion Companion = null;
    private static uz.gita.eventsapp.data.local.database.EventDatabase instance;
    
    public EventDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract uz.gita.eventsapp.data.local.dao.EventDao eventDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Luz/gita/eventsapp/data/local/database/EventDatabase$Companion;", "", "()V", "instance", "Luz/gita/eventsapp/data/local/database/EventDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final uz.gita.eventsapp.data.local.database.EventDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}