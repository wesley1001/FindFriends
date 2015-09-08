package com.ashkin.findfriends.activity;

import android.os.Bundle;

import com.ashkin.findfriends.R;
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
        LogUtil.i(TAG, getClass().getSimpleName() + " : onCreate ");

        // set SlidingMenu layout
        setBehindContentView(R.layout.layout_account);

        FindFriendsApp.addActivity(this);
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        LogUtil.i(TAG, getClass().getSimpleName() + " : onRestart ");
    }

    @Override
    protected void onStart() {
        super.onStart();

        LogUtil.i(TAG, getClass().getSimpleName() + " : onStart ");
    }

    @Override
    protected void onResume() {
        super.onResume();

        LogUtil.i(TAG, getClass().getSimpleName() + " : onResume ");
    }

    @Override
    protected void onPause() {
        super.onPause();

        LogUtil.i(TAG, getClass().getSimpleName() + " : onPause ");
    }

    @Override
    protected void onStop() {
        super.onStop();

        LogUtil.i(TAG, getClass().getSimpleName() + " : onStop ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        LogUtil.i(TAG, getClass().getSimpleName() + " : onDestroy ");

        FindFriendsApp.removeActivity(this);
    }


}
