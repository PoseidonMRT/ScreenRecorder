package com.example.code.screenrecorder;

import android.support.design.widget.BottomNavigationView;
import com.example.code.screenrecorder.common.BaseActivity;
import com.example.code.screenrecorder.common.helper.BottomNavigationViewHelper;

public class MainActivity extends BaseActivity {
    private BottomNavigationView mBottomNavigationView;
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initView() {
        mBottomNavigationView = findViewById(R.id.main_bottom_navigation_view);
    }

    @Override
    public void initData() {
        mBottomNavigationView.setItemIconTintList(null);
        BottomNavigationViewHelper.disableShiftMode(mBottomNavigationView);
    }
}
