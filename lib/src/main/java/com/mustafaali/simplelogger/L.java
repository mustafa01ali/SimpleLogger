package com.mustafaali.simplelogger;

import android.util.Log;

/**
 * Simplest logger around
 *
 * @author Mustafa Ali
 */
public class L {
    private static final String LOG_TAG = "SpecInspector";
    private static boolean mIsLoggingEnabled = true;

    /**
     * Use this to turn off logging for release builds until this fixed -
     * https://code.google.com/p/android/issues/detail?id=52962
     *
     * @param enabled
     */
    public static void setLoggingEnabled(boolean enabled) {
        mIsLoggingEnabled = enabled;
    }

    public static void d(String msg) {
        if (mIsLoggingEnabled) {
            Log.d(LOG_TAG, msg);
        }
    }

    public static void e(String msg, Throwable t) {
        if (mIsLoggingEnabled) {
            Log.e(LOG_TAG, msg, t);
        }
    }
}
