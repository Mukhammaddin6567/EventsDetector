package uz.gita.eventsapp.presentation.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0017\u0018B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000e\u001a\u00020\r2\n\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u001c\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J>\u0010\u0015\u001a\u00020\r26\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006R@\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Luz/gita/eventsapp/presentation/ui/adapter/EventsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Luz/gita/eventsapp/data/local/model/EventData;", "Luz/gita/eventsapp/presentation/ui/adapter/EventsAdapter$Holder;", "()V", "onEventStateChangeListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "eventId", "", "eventState", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnEventStateChangeListener", "block", "EventsAdapterDiffUtils", "Holder", "app_debug"})
public final class EventsAdapter extends androidx.recyclerview.widget.ListAdapter<uz.gita.eventsapp.data.local.model.EventData, uz.gita.eventsapp.presentation.ui.adapter.EventsAdapter.Holder> {
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> onEventStateChangeListener;
    
    public EventsAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public uz.gita.eventsapp.presentation.ui.adapter.EventsAdapter.Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    uz.gita.eventsapp.presentation.ui.adapter.EventsAdapter.Holder holder, int position) {
    }
    
    public final void setOnEventStateChangeListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> block) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c2\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Luz/gita/eventsapp/presentation/ui/adapter/EventsAdapter$EventsAdapterDiffUtils;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Luz/gita/eventsapp/data/local/model/EventData;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    static final class EventsAdapterDiffUtils extends androidx.recyclerview.widget.DiffUtil.ItemCallback<uz.gita.eventsapp.data.local.model.EventData> {
        @org.jetbrains.annotations.NotNull()
        public static final uz.gita.eventsapp.presentation.ui.adapter.EventsAdapter.EventsAdapterDiffUtils INSTANCE = null;
        
        private EventsAdapterDiffUtils() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        uz.gita.eventsapp.data.local.model.EventData oldItem, @org.jetbrains.annotations.NotNull()
        uz.gita.eventsapp.data.local.model.EventData newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        uz.gita.eventsapp.data.local.model.EventData oldItem, @org.jetbrains.annotations.NotNull()
        uz.gita.eventsapp.data.local.model.EventData newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Luz/gita/eventsapp/presentation/ui/adapter/EventsAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Luz/gita/eventsapp/databinding/ItemEventBinding;", "(Luz/gita/eventsapp/presentation/ui/adapter/EventsAdapter;Luz/gita/eventsapp/databinding/ItemEventBinding;)V", "bind", "app_debug"})
    public final class Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final uz.gita.eventsapp.databinding.ItemEventBinding viewBinding = null;
        
        public Holder(@org.jetbrains.annotations.NotNull()
        uz.gita.eventsapp.databinding.ItemEventBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final uz.gita.eventsapp.databinding.ItemEventBinding bind() {
            return null;
        }
    }
}