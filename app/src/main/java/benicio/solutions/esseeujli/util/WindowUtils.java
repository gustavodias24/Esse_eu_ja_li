package benicio.solutions.esseeujli.util;

import android.app.Activity;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatDelegate;

public class WindowUtils {

    public static void configWindow(Activity a) {

        a.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }
}
