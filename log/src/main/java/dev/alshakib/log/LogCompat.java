/*
 * MIT License
 *
 * Copyright (c) 2021 Al Shakib (shakib@alshakib.dev)
 *
 * This file is part of Log Compat
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package dev.alshakib.log;

import android.util.Log;

import androidx.annotation.NonNull;

public final class LogCompat {
    private final static String DEFAULT_LOG_TAG = "LogCompat";

    public static void info(@NonNull String tag, String message) {
        Log.i(tag, message);
    }

    public static void debug(@NonNull String tag, String message) {
        Log.d(tag, message);
    }

    public static void warning(@NonNull String tag, String message) {
        Log.w(tag, message);
    }

    public static void error(@NonNull String tag, String message) {
        Log.e(tag, message);
    }

    public static void info(@NonNull Class<?> tag, String message) {
        info(tag.getSimpleName(), message);
    }

    public static void debug(@NonNull Class<?> tag, String message) {
        debug(tag.getSimpleName(), message);
    }

    public static void warning(@NonNull Class<?> tag, String message) {
        warning(tag.getSimpleName(), message);
    }

    public static void error(@NonNull Class<?> tag, String message) {
        error(tag.getSimpleName(), message);
    }

    public static void info(@NonNull Object tag, String message) {
        info(tag.getClass(), message);
    }

    public static void debug(@NonNull Object tag, String message) {
        debug(tag.getClass(), message);
    }

    public static void warning(@NonNull Object tag, String message) {
        warning(tag.getClass(), message);
    }

    public static void error(@NonNull Object tag, String message) {
        error(tag.getClass(), message);
    }

    public static void info(String message) {
        info(DEFAULT_LOG_TAG, message);
    }

    public static void debug(String message) {
        debug(DEFAULT_LOG_TAG, message);
    }

    public static void warning(String message) {
        warning(DEFAULT_LOG_TAG, message);
    }

    public static void error(String message) {
        error(DEFAULT_LOG_TAG, message);
    }

    public static void info(@NonNull String tag, Exception exception) {
        if (exception != null) {
            info(tag, exception.getLocalizedMessage());
        } else {
            info(tag, "Exception is null");
        }
    }

    public static void debug(@NonNull String tag, Exception exception) {
        if (exception != null) {
            debug(tag, exception.getLocalizedMessage());
        } else {
            debug(tag, "Exception is null");
        }
    }

    public static void warning(@NonNull String tag, Exception exception) {
        if (exception != null) {
            warning(tag, exception.getLocalizedMessage());
        } else {
            warning(tag, "Exception is null");
        }
    }

    public static void error(@NonNull String tag, Exception exception) {
        if (exception != null) {
            error(tag, exception.getLocalizedMessage());
        } else {
            error(tag, "Exception is null");
        }
    }

    public static void info(@NonNull Class<?> tag, Exception exception) {
        info(tag.getSimpleName(), exception);
    }

    public static void debug(@NonNull Class<?> tag, Exception exception) {
        debug(tag.getSimpleName(), exception);
    }

    public static void warning(@NonNull Class<?> tag, Exception exception) {
        warning(tag.getSimpleName(), exception);
    }

    public static void error(@NonNull Class<?> tag, Exception exception) {
        error(tag.getSimpleName(), exception);
    }

    public static void info(@NonNull Object tag, Exception exception) {
        info(tag.getClass(), exception);
    }

    public static void debug(@NonNull Object tag, Exception exception) {
        debug(tag.getClass(), exception);
    }

    public static void warning(@NonNull Object tag, Exception exception) {
        warning(tag.getClass(), exception);
    }

    public static void error(@NonNull Object tag, Exception exception) {
        error(tag.getClass(), exception);
    }

    public static void info(Exception exception) {
        info(DEFAULT_LOG_TAG, exception);
    }

    public static void debug(Exception exception) {
        debug(DEFAULT_LOG_TAG, exception);
    }

    public static void warning(Exception exception) {
        warning(DEFAULT_LOG_TAG, exception);
    }

    public static void error(Exception exception) {
        error(DEFAULT_LOG_TAG, exception);
    }

    public static void info(@NonNull String tag, Object object) {
        if (object != null) {
            info(tag, object.toString());
        } else {
            info(tag, "Object is null");
        }
    }

    public static void debug(@NonNull String tag, Object object) {
        if (object != null) {
            debug(tag, object.toString());
        } else {
            debug(tag, "Object is null");
        }
    }

    public static void warning(@NonNull String tag, Object object) {
        if (object != null) {
            warning(tag, object.toString());
        } else {
            warning(tag, "Object is null");
        }
    }

    public static void error(@NonNull String tag, Object object) {
        if (object != null) {
            error(tag, object.toString());
        } else {
            error(tag, "Object is null");
        }
    }

    public static void info(@NonNull Class<?> tag, Object object) {
        info(tag.getSimpleName(), object);
    }

    public static void debug(@NonNull Class<?> tag, Object object) {
        debug(tag.getSimpleName(), object);
    }

    public static void warning(@NonNull Class<?> tag, Object object) {
        warning(tag.getSimpleName(), object);
    }

    public static void error(@NonNull Class<?> tag, Object object) {
        error(tag.getSimpleName(), object);
    }

    public static void info(@NonNull Object tag, Object object) {
        info(tag.getClass(), object);
    }

    public static void debug(@NonNull Object tag, Object object) {
        debug(tag.getClass(), object);
    }

    public static void warning(@NonNull Object tag, Object object) {
        warning(tag.getClass(), object);
    }

    public static void error(@NonNull Object tag, Object object) {
        error(tag.getClass(), object);
    }

    public static void info(Object object) {
        info(DEFAULT_LOG_TAG, object);
    }

    public static void debug(Object object) {
        debug(DEFAULT_LOG_TAG, object);
    }

    public static void warning(Object object) {
        warning(DEFAULT_LOG_TAG, object);
    }

    public static void error(Object object) {
        error(DEFAULT_LOG_TAG, object);
    }
}
