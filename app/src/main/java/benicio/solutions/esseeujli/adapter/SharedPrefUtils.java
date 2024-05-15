package benicio.solutions.esseeujli.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

public class SharedPrefUtils {
    public static final String PREFS_NAME = "user_prefs";
    public static final String KEY_PONTOS = "pontos";
    public static final String KEY_TROFEUS = "trofeus";


    public static void savePontos(Activity activity, int qtPontos) {
        SharedPreferences prefs = activity.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(KEY_PONTOS, qtPontos).apply();
        Toast.makeText(activity, "Pontos Salvos!", Toast.LENGTH_SHORT).show();
    }

    public static int returnPontos(Activity activity) {
        SharedPreferences prefs = activity.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return prefs.getInt(KEY_PONTOS, 0);
    }


    public static void saveTrofeus(Activity activity, String listaTrofeus) {
        SharedPreferences prefs = activity.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(KEY_TROFEUS, listaTrofeus).apply();
    }

    public static String returnTrofeus(Activity activity) {
        SharedPreferences prefs = activity.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return prefs.getString(KEY_TROFEUS, "Nenhum Trófeu ainda.");
    }


}
