package com.example.code.screenrecorder;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

  @NonNull
  private FragmentTabHost mFragmentTabHost;

  private LayoutInflater mLayoutInflater;

  private int[] mTabItemText = {R.string.main_bottom_screen_record,R.string.main_bottom_video_manager,R.string.main_bottom_discover,R.string.main_bottom_match};
  private int[] mTabItemImage = {R.drawable.bottom_bar_screen_record_state_list,R.drawable.bottom_bar_video_manager_state_list,R.drawable.bottom_bar_discover_state_list,R.drawable.bottom_bar_match_state_list};

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
    setUpTabs();
  }

  private void setUpTabs(){
    mLayoutInflater = LayoutInflater.from(this);
    for (int i=0;i<4;i++){
      mFragmentTabHost.addTab(mFragmentTabHost.newTabSpec(getString(mTabItemText[i])).setIndicator(getTabItemView(i)),ScreenRecordFragment.class,null);
    }
  }

  private View getTabItemView(int index){
    View view = mLayoutInflater.inflate(R.layout.tab_item_layout, null);

    ImageView imageView = (ImageView) view.findViewById(R.id.tab_item_image);
    imageView.setImageResource(mTabItemImage[index]);

    TextView textView = (TextView) view.findViewById(R.id.tab_item_text);
    textView.setText(mTabItemText[index]);

    return view;
  }
}
