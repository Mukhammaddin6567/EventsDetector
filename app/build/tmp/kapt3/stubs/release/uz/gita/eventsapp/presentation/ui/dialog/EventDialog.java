package uz.gita.eventsapp.presentation.ui.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0014\u0010\u001b\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\u001d\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\u001e\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\u001f\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010 \u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006!"}, d2 = {"Luz/gita/eventsapp/presentation/ui/dialog/EventDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "onClickDisableAllEventsListener", "Lkotlin/Function0;", "", "onClickEnableAllEventsListener", "onClickQuitAppListener", "onClickRateListener", "onClickShareListener", "viewBinding", "Luz/gita/eventsapp/databinding/DialogBottomBinding;", "getViewBinding", "()Luz/gita/eventsapp/databinding/DialogBottomBinding;", "viewBinding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setOnClickDisableAllEventsListener", "block", "setOnClickEnableAllEventsListener", "setOnClickQuitAppListener", "setOnClickRateListener", "setOnClickShareListener", "app_release"})
public final class EventDialog extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty viewBinding$delegate = null;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickShareListener;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickRateListener;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickDisableAllEventsListener;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickEnableAllEventsListener;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickQuitAppListener;
    
    public EventDialog() {
        super();
    }
    
    private final uz.gita.eventsapp.databinding.DialogBottomBinding getViewBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setOnClickEnableAllEventsListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public final void setOnClickDisableAllEventsListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public final void setOnClickShareListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public final void setOnClickRateListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public final void setOnClickQuitAppListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
}