package in.darshana.showtime.Utils;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceManager {
    // Shared preferences file name
    private static final String PREF_NAME = "User_Preference";
    private static final String IS_USER_LOGGED = "IS_USER_LOGGED";
    private static final String USER_DATA = "USER_DATA";
    private static final String USER_FCM_TOKEN = "USER_FCM_TOKEN";

    // shared pref mode
    private int PRIVATE_MODE = 0;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Context _context;

    public PreferenceManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }
}
