package uz.gita.eventsapp.presentation.viewmodel.impl;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;
import java.lang.String;

@OriginatingElement(
    topLevelClass = SplashViewModelImpl.class
)
public final class SplashViewModelImpl_HiltModules {
  private SplashViewModelImpl_HiltModules() {
  }

  @Module
  @InstallIn(ViewModelComponent.class)
  public abstract static class BindsModule {
    private BindsModule() {
    }

    @Binds
    @IntoMap
    @StringKey("uz.gita.eventsapp.presentation.viewmodel.impl.SplashViewModelImpl")
    @HiltViewModelMap
    public abstract ViewModel binds(SplashViewModelImpl vm);
  }

  @Module
  @InstallIn(ActivityRetainedComponent.class)
  public static final class KeyModule {
    private KeyModule() {
    }

    @Provides
    @IntoSet
    @HiltViewModelMap.KeySet
    public static String provide() {
      return "uz.gita.eventsapp.presentation.viewmodel.impl.SplashViewModelImpl";
    }
  }
}
