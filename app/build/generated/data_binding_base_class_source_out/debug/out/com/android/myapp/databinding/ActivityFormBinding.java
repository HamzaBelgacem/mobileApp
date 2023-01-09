// Generated by view binder compiler. Do not edit!
package com.android.myapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.myapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFormBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button b1;

  @NonNull
  public final Button b2;

  @NonNull
  public final Button b4;

  @NonNull
  public final ListView list;

  @NonNull
  public final EditText t1;

  @NonNull
  public final TextView textView;

  private ActivityFormBinding(@NonNull RelativeLayout rootView, @NonNull Button b1,
      @NonNull Button b2, @NonNull Button b4, @NonNull ListView list, @NonNull EditText t1,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.b1 = b1;
    this.b2 = b2;
    this.b4 = b4;
    this.list = list;
    this.t1 = t1;
    this.textView = textView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFormBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFormBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_form, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFormBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.b1;
      Button b1 = ViewBindings.findChildViewById(rootView, id);
      if (b1 == null) {
        break missingId;
      }

      id = R.id.b2;
      Button b2 = ViewBindings.findChildViewById(rootView, id);
      if (b2 == null) {
        break missingId;
      }

      id = R.id.b4;
      Button b4 = ViewBindings.findChildViewById(rootView, id);
      if (b4 == null) {
        break missingId;
      }

      id = R.id.list;
      ListView list = ViewBindings.findChildViewById(rootView, id);
      if (list == null) {
        break missingId;
      }

      id = R.id.t1;
      EditText t1 = ViewBindings.findChildViewById(rootView, id);
      if (t1 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityFormBinding((RelativeLayout) rootView, b1, b2, b4, list, t1, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}