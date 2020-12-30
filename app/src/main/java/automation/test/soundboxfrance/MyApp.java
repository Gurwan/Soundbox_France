/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;

import android.app.Application;
import android.os.SystemClock;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(1000);
    }
}
