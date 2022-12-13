package com.example.hellofragment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hellofragment.R;

public class HelloFragment extends BaseFragment {

    private static final String TAG = "HelloFragment";

    @Override
    protected String getLogTag() {
        return TAG;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_hello, container, false);
    }
}
