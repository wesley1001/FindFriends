package com.ashkin.findfriends.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ashkin.findfriends.R;
import com.ashkin.findfriends.fragment.LoginFragment;
import com.ashkin.findfriends.util.StringUtil;

/**
 * Login and Register Activity
 */
public class StartActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
}
