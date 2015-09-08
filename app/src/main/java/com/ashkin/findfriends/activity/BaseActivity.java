package com.ashkin.findfriends.activity;

import android.os.Bundle;

import com.ashkin.findfriends.app.FindFriendsApp;
import com.ashkin.findfriends.util.LogUtil;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

/**
 * Base Activity
 */
public class BaseActivity extends SlidingFragmentActivity {

    public static final String TAG = "BaseActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Log current Activity name;
        LogUtil.i(TAG,"Activity : " + getClass().getSimpleName() + " onCreate ");

        FindFriendsApp.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        FindFriendsApp.removeActivity(this);
    }


}
