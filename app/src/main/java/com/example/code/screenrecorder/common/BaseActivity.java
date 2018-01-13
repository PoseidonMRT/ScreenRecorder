package com.example.code.screenrecorder.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Class description
 *
 * @author tuozhaobing
 * @date 2018/1/4
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (needTranslucentStatusBar()){
            getWindow().setStatusBarColor(getResources().getColor(getStatusBarColor()));
        }
        setContentView();
        initView(savedInstanceState);
        initData();
    }

    public abstract void setContentView();
    public abstract void initView(Bundle savedInstanceState);
    public abstract void initData();
    public abstract boolean needTranslucentStatusBar();
    public abstract int getStatusBarColor();
}
