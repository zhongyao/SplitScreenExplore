package com.hongri.split.util;

import android.util.Log;

public class Logger {

    public static void d(String tag, String msg) {
        if (tag != null && msg != null) {
            Log.d(tag, msg);
        }
    }
}
