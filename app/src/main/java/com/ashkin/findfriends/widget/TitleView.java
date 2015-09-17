package com.ashkin.findfriends.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ashkin.findfriends.R;

/**
 * 顶部菜单栏
 */
public class TitleView extends LinearLayout {

    private TextView mLeftText = null;
    private TextView mCenterText = null;
    private TextView mRightText = null;

    public TitleView(Context context) {
        super(context);
    }

    public TitleView(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.view_title, this);

        mLeftText = (TextView) findViewById(R.id.title_left_id);
        mCenterText = (TextView) findViewById(R.id.title_center_id);
        mRightText = (TextView) findViewById(R.id.title_right_id);
    }

    /**
     * 设置菜单栏左边按钮的点击事件
     *
     * @param listener 点击事件监听器
     */
    public void setLeftOnClickListener(OnClickListener listener) {
        mLeftText.setOnClickListener(listener);
    }

    /**
     * 设置菜单栏右边按钮的点击事件
     *
     * @param listener 点击监听器
     */
    public void setRightOnClickListener(OnClickListener listener) {
        mRightText.setOnClickListener(listener);
    }

    /**
     * 设置菜单栏左边按钮的触摸事件
     * @param listener the touch listener on attach this view 触摸监听器
     */
    public void setLeftOnTouchListener(OnTouchListener listener) {
        mLeftText.setOnTouchListener(listener);
    }

    /**
     * 设置菜单栏右边按钮的触摸事件
     * @param listener the touch listener on attach this view 触摸监听器
     */
    public void setCenterOnTouchListener(OnTouchListener listener) {
        mCenterText.setOnTouchListener(listener);
    }

    /**
     * set Left TextView Text
     * 设置左边 TextView 的文本
     * @param text text 文本内容
     */
    public void setLeftText(CharSequence text) {
        mLeftText.setText(text);
    }

    /**
     * set Center TextView Text
     * 设置中间 TextView 的文本
     * @param text text 文本内容
     */
    public void setCenterText(CharSequence text) {
        mLeftText.setText(text);
    }

    /**
     * set Right TextView Text
     * 设置右边 TextView 的文本
     * @param text text 文本内容
     */
    public void setRightText(CharSequence text) {
        mLeftText.setText(text);
    }

    /**
     * set Lift TextView Background
     * 这设置左边 TextView 的背景
     * @param resid DrawableRes 资源 ID
     */
    public void setLeftBackgroundResource (int resid) {
        mLeftText.setBackgroundResource(resid);
    }

    /**
     * set Right TextView Background
     * 这设置右边 TextView 的背景
     * @param resid DrawableRes 资源 ID
     */
    public void setRightBackgroundResource(int resid) {
        mRightText.setBackgroundResource(resid);
    }

    /**
     * return Left TextView
     * 返回左边的 TextView
     * @return
     */
    public TextView getLeftText() {
        return mLeftText;
    }

    /**
     * return Right TextView
     * 返回右边的 TextView
     * @return
     */
    public TextView getRightText() {
        return mRightText;
    }
}
