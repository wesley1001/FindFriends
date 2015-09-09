package com.ashkin.findfriends.activity;

import android.app.Activity;
import android.os.Bundle;

import com.ashkin.findfriends.R;
import com.ashkin.findfriends.app.Config;
import com.ashkin.findfriends.app.FindFriendsApp;
import com.ashkin.findfriends.util.LogUtil;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import cn.bmob.v3.Bmob;

/**
 * Base Activity
 */
public class BaseActivity extends SlidingFragmentActivity {

    public static final String TAG = "BaseActivity";

    protected Activity context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Log current Activity name;
        LogUtil.i(TAG, getClass().getSimpleName() + " : onCreate ");

        // set SlidingMenu layout
        LogUtil.i(TAG, "setBehindContentView");
        setBehindContentView(R.layout.layout_account);

        // initialize Bmob SDK
        LogUtil.i(TAG, "initialize Bmob SDK");
        Bmob.initialize(this, Config.BMOB_APPLICATION_ID);

        context = this;

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
