package com.hongri.split;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;

import com.hongri.split.util.Logger;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.d(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.d(TAG, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.d(TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d(TAG, "onDestroy");
    }


    /**
     * 当AndroidManifest文件中设置该Activity 属性android:resizeableActivity为false的时候
     * 该 方法不会调用。【下同】
     * @param isInMultiWindowMode
     */
    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);

        Logger.d(TAG, "isInMultiWindowMode: " + isInMultiWindowMode);
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
        Logger.d(TAG, "isInMultiWindowMode--:" + isInMultiWindowMode);
    }

    /**
     * 上下拖动分屏窗口大小的时候，该方法调用
     * @param newConfig
     */
    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Logger.d(TAG, "onConfigurationChanged");
    }
}
