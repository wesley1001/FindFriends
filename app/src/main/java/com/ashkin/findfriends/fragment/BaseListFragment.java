package com.ashkin.findfriends.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.ashkin.findfriends.util.LogUtil;

/**
 * Base ListFragment
 */
public class BaseListFragment extends ListFragment {

    private static final String TAG = "BaseListFragment";

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // Log current Fragment name;
        LogUtil.i(TAG, getClass().getSimpleName() + " : onAttach ");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Log current Fragment name;
        LogUtil.i(TAG, getClass().getSimpleName() + " : onCreate ");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Log current Fragment name;
        LogUtil.i(TAG, getClass().getSimpleName() + " : onCreateView ");

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Log current Fragment name;
        LogUtil.i(TAG, getClass().getSimpleName() + " : onActivityCreated ");
    }

    @Override
    public void onStart() {
        super.onStart();

        // Log current Fragment name;
        LogUtil.i(TAG, getClass().getSimpleName() + " : onStart ");
    }

    @Override
    public void onResume() {
        super.onResume();

        // Log current Fragment name;
        LogUtil.i(TAG, getClass().getSimpleName() + " : onResume ");
    }

    @Override
    public void onPause() {
        super.onPause();

        // Log current Fragment name;
        LogUtil.i(TAG, getClass().getSimpleName() + " : onPause ");
    }

    @Override
    public void onStop() {
        super.onStop();

        // Log current Fragment name;
        LogUtil.i(TAG, getClass().getSimpleName() + " : onStop ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        // Log current Fragment name;
        LogUtil.i(TAG, getClass().getSimpleName() + " : onDestroyView ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        // Log current Fragment name;
        LogUtil.i(TAG, getClass().getSimpleName() + " : onDestroy ");
    }

    @Override
    public void onDetach() {
        super.onDetach();

        // Log current Fragment name;
        LogUtil.i(TAG, getClass().getSimpleName() + " : onDetach ");
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        // Log onListItemClick status
        LogUtil.i(TAG, getClass().getSimpleName() + " : onListItemClick ");
    }
}
