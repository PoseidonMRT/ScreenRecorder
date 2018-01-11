package com.example.code.screenrecorder;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTabHost;

public class MainActivity extends BaseActivity {

  @NonNull
  private FragmentTabHost mFragmentTabHost;

  @Override
  void setContentView() {
    setContentView(R.layout.activity_main);
  }

  @Override
  void initView() {
    mFragmentTabHost = findViewById(R.id.main_tab_host);
    mFragmentTabHost.setup(this,getSupportFragmentManager());
  }

  @Override
  void initData() {
    initTabs();
  }

  private void initTabs(){

  }
}
