package com.laxmikant.mydaggerapp;

import android.content.SharedPreferences;


/**
 * Created by Laxmikant Mahamuni on 22-03-2018.
 */

/**
 * Custom application class extends SDKApplication class,
 */
public class BATApplication extends DaggerApplication {

    private static BATApplication instance = new BATApplication();

    private SharedPreferences sharedPreferences = null;

    public static BATApplication getInstance() {
        return instance;
    }


    //One more test commit
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
