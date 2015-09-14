package com.ashkin.findfriends.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ashkin.findfriends.R;

/**
 * Login Fragment
 */
public class LoginFragment extends BaseFragment {

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        return view;
    }

}
