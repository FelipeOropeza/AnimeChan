// Generated by view binder compiler. Do not edit!
package com.example.kitsuapi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kitsuapi.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPersoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView apelidoText;

  @NonNull
  public final ImageButton btnBusca;

  @NonNull
  public final TextView funcText;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView metasText;

  @NonNull
  public final TextView nomeText;

  @NonNull
  public final TextView origemText;

  @NonNull
  public final EditText persoinput;

  @NonNull
  public final TextView poderText;

  private ActivityPersoBinding(@NonNull ConstraintLayout rootView, @NonNull TextView apelidoText,
      @NonNull ImageButton btnBusca, @NonNull TextView funcText, @NonNull ImageView imageView3,
      @NonNull LinearLayout linearLayout, @NonNull TextView metasText, @NonNull TextView nomeText,
      @NonNull TextView origemText, @NonNull EditText persoinput, @NonNull TextView poderText) {
    this.rootView = rootView;
    this.apelidoText = apelidoText;
    this.btnBusca = btnBusca;
    this.funcText = funcText;
    this.imageView3 = imageView3;
    this.linearLayout = linearLayout;
    this.metasText = metasText;
    this.nomeText = nomeText;
    this.origemText = origemText;
    this.persoinput = persoinput;
    this.poderText = poderText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPersoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPersoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_perso, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPersoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.apelidoText;
      TextView apelidoText = ViewBindings.findChildViewById(rootView, id);
      if (apelidoText == null) {
        break missingId;
      }

      id = R.id.btnBusca;
      ImageButton btnBusca = ViewBindings.findChildViewById(rootView, id);
      if (btnBusca == null) {
        break missingId;
      }

      id = R.id.funcText;
      TextView funcText = ViewBindings.findChildViewById(rootView, id);
      if (funcText == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.metasText;
      TextView metasText = ViewBindings.findChildViewById(rootView, id);
      if (metasText == null) {
        break missingId;
      }

      id = R.id.nomeText;
      TextView nomeText = ViewBindings.findChildViewById(rootView, id);
      if (nomeText == null) {
        break missingId;
      }

      id = R.id.origemText;
      TextView origemText = ViewBindings.findChildViewById(rootView, id);
      if (origemText == null) {
        break missingId;
      }

      id = R.id.persoinput;
      EditText persoinput = ViewBindings.findChildViewById(rootView, id);
      if (persoinput == null) {
        break missingId;
      }

      id = R.id.poderText;
      TextView poderText = ViewBindings.findChildViewById(rootView, id);
      if (poderText == null) {
        break missingId;
      }

      return new ActivityPersoBinding((ConstraintLayout) rootView, apelidoText, btnBusca, funcText,
          imageView3, linearLayout, metasText, nomeText, origemText, persoinput, poderText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
