package com.example.hellofragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.hellofragment.fragment.MainFragment;

public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentListener {

    private static final String TAG = "MainActivity";

    private Button mReplaceButton;

    @Override
    public void onMultiTabsViewCreated(int tabsCount) {
        TextView tv = findViewById(R.id.tv_tabs_count);
        tv.setText(tabsCount + " tabs created");
        tv.setVisibility(View.VISIBLE);
    }

    @Override
    public void onMultiTabsViewDetach() {
        mReplaceButton.setVisibility(View.VISIBLE);
        TextView tv = findViewById(R.id.tv_tabs_count);
        tv.setVisibility(View.GONE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate --- Start ---");
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate --- End   ---");
        setContentView(R.layout.activity_main);

        mReplaceButton = findViewById(R.id.btn_replace);
        mReplaceButton.setOnClickListener(v -> {
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction() //启动事务
                    .add(R.id.fragment_container, new MainFragment())
                    .addToBackStack(null) //与remove相比，放入返回栈，按返回键时可以退回到上一个fragment
                    .commit();
            mReplaceButton.setVisibility(View.GONE);
        });
    }

    @Override
    protected void onRestart() {
        Log.i(TAG, "onRestart --- Start ---");
        super.onRestart();
        Log.i(TAG, "onRestart --- End   ---");
    }

    @Override
    protected void onStart() {
        Log.i(TAG, "onStart --- Start ---");
        super.onStart();
        Log.i(TAG, "onStart --- End   ---");
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "onResume --- Start ---");
        super.onResume();
        Log.i(TAG, "onResume --- End   ---");
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "onPause --- Start ---");
        super.onPause();
        Log.i(TAG, "onPause --- End   ---");
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "onStop --- Start ---");
        super.onStop();
        Log.i(TAG, "onStop --- End   ---");
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy --- Start ---");
        super.onDestroy();
        Log.i(TAG, "onDestroy --- End   ---");
    }
}