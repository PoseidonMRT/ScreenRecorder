package com.example.code.screenrecorder.common;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tuozhaobing on 18/1/13.
 */

public abstract class BaseFragment extends Fragment {

  private View mRootView;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    mRootView = inflater.inflate(getLayoutRes(),container,false);
    return mRootView;
  }

  public abstract int getLayoutRes();
  public abstract void initView();
  public abstract void initData();

  public View getView(int resId){
    return mRootView.findViewById(resId);
  }

  public View getRootView() {
    return mRootView;
  }
}
