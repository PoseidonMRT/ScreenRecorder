package com.example.code.screenrecorder.common.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.code.screenrecorder.R;

/**
 * Created by tuozhaobing on 18/1/13.
 */

public class NavigationTopBar extends RelativeLayout implements OnClickListener{

  private LayoutInflater mLayoutInflater;
  private View mRootView;
  private ImageView mLeftImage,mRightImage,mAlignRightLeftImage;
  private TextView mTitleText;
  private NavigationTopBarClickListener mNavigationTopBarClickListener;

  public NavigationTopBar(Context context) {
    super(context);
    initLayout(context);
  }

  public NavigationTopBar(Context context, AttributeSet attrs) {
    super(context, attrs);
    initLayout(context);
  }

  public NavigationTopBar(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    initLayout(context);
  }

  public NavigationTopBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
    initLayout(context);
  }

  private void initLayout(Context context){
    mLayoutInflater = LayoutInflater.from(context);
    mRootView = mLayoutInflater.inflate(R.layout.main_navigation_bar_layout,this,true);
    mTitleText = mRootView.findViewById(R.id.center_text);
    mLeftImage = mRootView.findViewById(R.id.left_image);
    mRightImage = mRootView.findViewById(R.id.right_image);
    mAlignRightLeftImage = mRootView.findViewById(R.id.align_right_image_left_image);

    mLeftImage.setOnClickListener(this);
    mRightImage.setOnClickListener(this);
    mAlignRightLeftImage.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()){
      case R.id.left_image:
        mNavigationTopBarClickListener.leftImageClick();
        break;
      case R.id.right_image:
        mNavigationTopBarClickListener.rightImageClick();
        break;
      case R.id.align_right_image_left_image:
        mNavigationTopBarClickListener.alignRightLeftImageClick();
        break;
    }
  }

  public void setNavigationTopBarClickListener(
      @NonNull NavigationTopBarClickListener navigationTopBarClickListener) {
    mNavigationTopBarClickListener = navigationTopBarClickListener;
  }

  public void setLeftImageResource(int resId){
    mLeftImage.setImageResource(resId);
  }

  public void setLeftImageDrawable(Drawable drawable){
    mLeftImage.setImageDrawable(drawable);
  }

  public void setLeftImageBitmap(Bitmap bitmap){
    mLeftImage.setImageBitmap(bitmap);
  }

  public void setLeftImageVisiable(int visiable){
    mLeftImage.setVisibility(visiable);
  }

  public void setRightImageResource(int resId){
    mRightImage.setImageResource(resId);
  }

  public void setRightImageDrawable(Drawable drawable){
    mRightImage.setImageDrawable(drawable);
  }

  public void setRightImageBitmap(Bitmap bitmap){
    mRightImage.setImageBitmap(bitmap);
  }

  public void setRightImageVisiable(int visiable){
    mRightImage.setVisibility(visiable);
  }

  public void setCenterTitleText(String title){
    mTitleText.setText(title);
  }

  public void setCenterTitleText(int resId){
    mTitleText.setText(resId);
  }

  public void setCenterTitleText(CharSequence charSequence){
    mTitleText.setText(charSequence);
  }

  public void setCenterTitleVisiable(int visiable){
    mTitleText.setVisibility(visiable);
  }

  public void setAlignRightLeftImageResource(int resId){
    mAlignRightLeftImage.setImageResource(resId);
  }

  public void setAlignRightLeftImageDrawable(Drawable drawable){
    mAlignRightLeftImage.setImageDrawable(drawable);
  }

  public void setAlignRightLeftImageBitmap(Bitmap bitmap){
    mAlignRightLeftImage.setImageBitmap(bitmap);
  }

  public void setAlignRightLeftImageVisiable(int visiable){
    mAlignRightLeftImage.setVisibility(visiable);
  }

  public void setCenterTitleTextColor(int colorId){
    mTitleText.setTextColor(getResources().getColor(colorId));
  }

  public interface NavigationTopBarClickListener{
    public void leftImageClick();
    public void rightImageClick();
    public void alignRightLeftImageClick();
  }
}
