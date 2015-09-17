package com.ashkin.findfriends.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Toast Util，提示框工具类
 */
public class ToastUtil {

    /** 是否显示提示框 */
    private static final boolean isShow = true;

    /**
     * show a short time toast
     * 显示一个短时间的提示框
     * @param context context
     * @param msg message
     */
    public static void showShortToast(Context context, String msg) {
        if (isShow) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * show a long time toast
     * 显示一个长时间的提示框
     * @param context context
     * @param msg message
     */
    public static void showLongToast(Context context, String msg) {
        if (isShow) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
        }
    }
}
