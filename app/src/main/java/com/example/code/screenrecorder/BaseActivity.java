package com.example.code.screenrecorder;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

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
        setContentView();
        initView();
        initData();
    }

    abstract void setContentView();
    abstract void initView();
    abstract void initData();
}
