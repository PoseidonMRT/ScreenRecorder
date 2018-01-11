package com.example.code.screenrecorder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ScreenRecordFragment extends Fragment {

  public ScreenRecordFragment() {
  }

  public static ScreenRecordFragment newInstance() {
    ScreenRecordFragment fragment = new ScreenRecordFragment();
    return fragment;
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_screen_record, container, false);
  }

}
