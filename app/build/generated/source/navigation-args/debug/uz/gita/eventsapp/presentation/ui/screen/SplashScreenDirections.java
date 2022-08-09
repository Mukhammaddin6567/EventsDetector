package uz.gita.eventsapp.presentation.ui.screen;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import uz.gita.eventsapp.R;

public class SplashScreenDirections {
  private SplashScreenDirections() {
  }

  @NonNull
  public static NavDirections actionSplashScreenToEventsScreen() {
    return new ActionOnlyNavDirections(R.id.action_splashScreen_to_eventsScreen);
  }
}
