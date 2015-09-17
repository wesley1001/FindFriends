package com.ashkin.findfriends.activity;

import android.os.Bundle;

import com.ashkin.findfriends.R;

/**
 * Login and Register Activity
 */
public class StartActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}