package com.example.code.screenrecorder;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener;
import android.support.v4.app.Fragment;
import android.util.ArrayMap;
import android.view.MenuItem;
import com.example.code.screenrecorder.common.BaseActivity;
import com.example.code.screenrecorder.common.helper.BottomNavigationViewHelper;
import com.example.code.screenrecorder.common.widget.NavigationTopBar;
import com.example.code.screenrecorder.common.widget.NavigationTopBar.NavigationTopBarClickListener;

public class MainActivity extends BaseActivity implements OnNavigationItemSelectedListener,NavigationTopBarClickListener{
    private BottomNavigationView mBottomNavigationView;
    private NavigationTopBar mNavigationTopBar;
    private ArrayMap<String,Fragment> mMainFragments;
    public static final String SCREEN_RECORD_FRAGMENT_TAG = "screen_record";
    public static final String MATCH_FRAGMENT_TAG = "match";
    public static final String DISCOVER_FRAGMENT_TAG = "discover";
    public static final String VIDEO_MANAGER_FRAGMENT_TAG = "video_manager";
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        mMainFragments = new ArrayMap<>();
        mNavigationTopBar = findViewById(R.id.main_top_bar);
        mBottomNavigationView = findViewById(R.id.main_bottom_navigation_view);
        if (savedInstanceState == null){
            startFragment(SCREEN_RECORD_FRAGMENT_TAG);
        }
    }

    @Override
    public void initData() {
        mNavigationTopBar.setLeftImageResource(R.drawable.user_center);
        mNavigationTopBar.setRightImageResource(R.drawable.settings);
        mNavigationTopBar.setAlignRightLeftImageResource(R.drawable.help_center);
        mNavigationTopBar.setCenterTitleText(R.string.app_name);
        mNavigationTopBar.setCenterTitleTextColor(R.color.color_FFFFFF);
        mNavigationTopBar.setNavigationTopBarClickListener(this);
        mBottomNavigationView.setItemIconTintList(null);
        BottomNavigationViewHelper.disableShiftMode(mBottomNavigationView);
        mBottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean needTranslucentStatusBar() {
        return true;
    }

    @Override
    public int getStatusBarColor() {
        return R.color.color_36AFF9;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.main_bottom_screen_record:
                startFragment(SCREEN_RECORD_FRAGMENT_TAG);
                return true;
            case R.id.main_bottom_video_manager:
                startFragment(VIDEO_MANAGER_FRAGMENT_TAG);
                return true;
            case R.id.main_bottom_discover:
                startFragment(DISCOVER_FRAGMENT_TAG);
                return true;
            case R.id.main_bottom_match:
                startFragment(MATCH_FRAGMENT_TAG);
                return true;
        }
        return false;
    }

    @Override
    public void leftImageClick() {

    }

    @Override
    public void rightImageClick() {

    }

    @Override
    public void alignRightLeftImageClick() {

    }

    private void startFragment(@NonNull String fragmentTag){
        if (mMainFragments.get(fragmentTag) == null || !mMainFragments.containsKey(fragmentTag)){
            createFragment(fragmentTag);
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.main_content,mMainFragments.get(fragmentTag)).commit();
    }

    private void createFragment(@NonNull String fragmentTag){
        switch (fragmentTag){
            case SCREEN_RECORD_FRAGMENT_TAG:
                ScreenRecordFragment _screenRecordFragment = new ScreenRecordFragment();
                mMainFragments.put(SCREEN_RECORD_FRAGMENT_TAG,_screenRecordFragment);
                break;
            case DISCOVER_FRAGMENT_TAG:
                DiscoverFragment _discoverFragment = new DiscoverFragment();
                mMainFragments.put(DISCOVER_FRAGMENT_TAG,_discoverFragment);
                break;
            case VIDEO_MANAGER_FRAGMENT_TAG:
                VideoManagerFragment _videoManagerFragment = new VideoManagerFragment();
                mMainFragments.put(VIDEO_MANAGER_FRAGMENT_TAG,_videoManagerFragment);
                break;
            case MATCH_FRAGMENT_TAG:
                MatchFragment _matchFragment = new MatchFragment();
                mMainFragments.put(MATCH_FRAGMENT_TAG,_matchFragment);
                break;
        }
    }
}
