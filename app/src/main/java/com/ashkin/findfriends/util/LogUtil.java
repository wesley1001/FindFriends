package com.ashkin.findfriends.util;

import android.util.Log;

/**
 * Log util
 */
public class LogUtil {

    // Log level
    public static final int VERBOSE = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
    public static final int WARN = 4;
    public static final int ERROR = 5;
    public static final int NOTHING = 6;

    // current level
    public static final int LEVEL = VERBOSE;

    /**
     * Log Verbose
     * @param tag tag
     * @param msg message
     */
    public static void v(String tag, String msg) {
        if (LEVEL <= VERBOSE) {
            Log.v(tag, msg);
        }
    }

    /**
     * Log Debug
     * @param tag tag
     * @param msg message
     */
    public static void d(String tag, String msg) {
        if (LEVEL <= DEBUG) {
            Log.d(tag, msg);
        }
    }

    /**
     * Log Info
     * @param tag tag
     * @param msg message
     */
    public static void i(String tag, String msg) {
        if (LEVEL <= INFO) {
            Log.i(tag, msg);
        }
    }

    /**
     * Log Warn
     * @param tag tag
     * @param msg message
     */
    public static void w(String tag, String msg) {
        if (LEVEL <= WARN) {
            Log.w(tag, msg);
        }
    }

    /**
     * Log Error
     * @param tag tag
     * @param msg message
     */
    public static void e(String tag, String msg) {
        if (LEVEL <= ERROR) {
            Log.e(tag, msg);
        }
    }
}
