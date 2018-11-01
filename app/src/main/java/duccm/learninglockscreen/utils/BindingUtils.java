package duccm.learninglockscreen.utils;

import android.databinding.BindingAdapter;
import android.view.View;

public class BindingUtils {
    @BindingAdapter("android:visibility")
    public static void setVisibility(View view, boolean isVisible) {
        view.setVisibility(isVisible ? View.VISIBLE : View.GONE);
    }
}
