package com.example.ryanstarback.cardstack;

import android.app.Application;
import android.content.Context;

/**
 * Created by ryanstarback on 10/4/17.
 */

public class CardStack extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
    }
}
