// Generated by view binder compiler. Do not edit!
package uz.gita.eventsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.eventsapp.R;

public final class ScreenTestBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final SwitchCompat switchScreenOff;

  @NonNull
  public final SwitchCompat switchScreenOn;

  private ScreenTestBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull SwitchCompat switchScreenOff, @NonNull SwitchCompat switchScreenOn) {
    this.rootView = rootView;
    this.switchScreenOff = switchScreenOff;
    this.switchScreenOn = switchScreenOn;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ScreenTestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ScreenTestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.screen_test, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ScreenTestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.switchScreenOff;
      SwitchCompat switchScreenOff = ViewBindings.findChildViewById(rootView, id);
      if (switchScreenOff == null) {
        break missingId;
      }

      id = R.id.switchScreenOn;
      SwitchCompat switchScreenOn = ViewBindings.findChildViewById(rootView, id);
      if (switchScreenOn == null) {
        break missingId;
      }

      return new ScreenTestBinding((LinearLayoutCompat) rootView, switchScreenOff, switchScreenOn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
