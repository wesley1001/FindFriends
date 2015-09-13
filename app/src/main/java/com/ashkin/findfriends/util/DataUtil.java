package com.ashkin.findfriends.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.ashkin.findfriends.app.Config;

/**
 * SharedPreferences Util
 * SharedPreferences 工具类
 */
public class DataUtil {

    private static final String TAG = "DataUtil";

    private static DataUtil instance = null;

    private Context context = null;

    private SharedPreferences mPreferences = null;
    private SharedPreferences.Editor mEditor = null;

    private DataUtil(Context context) {
        this.context = context;
        this.mPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    /**
     * Return DataUtil instance
     * 返回 DataUtil 工具类的实例
     *
     * @param context The context of the preferences whose values are wanted.
     * @return DataUtil Instance
     */
    public static DataUtil getInstance(Context context) {
        if (instance == null) {
            Log.i(TAG, "DataUtil initialize");
            instance = new DataUtil(context);
        }
        return instance;
    }

    /**
     * return the remember account status, if preference does not exist, return false;
     * 返回是否记录登录状态，如果键值对不存在，返回 false
     *
     * @return remember account status
     */
    public boolean isRemember() {
        boolean isRemember = this.mPreferences.getBoolean(Config.SP_REMEMBER_ACCOUNT, false);
        LogUtil.i(TAG, "isRemember = " + isRemember);
        return isRemember;
    }

    /**
     * set remember account status
     * 设置是否保存登录状态。
     *
     * @param isRemember remember account status
     */
    public void setRemember(boolean isRemember) {
        mEditor = mPreferences.edit();

        mEditor.putBoolean(Config.SP_REMEMBER_ACCOUNT, isRemember);

        mEditor.apply();
    }

    /**
     *
     */
//    public
}
