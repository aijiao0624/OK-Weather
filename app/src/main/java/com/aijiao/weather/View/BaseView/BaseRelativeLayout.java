package com.aijiao.weather.View.BaseView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import butterknife.ButterKnife;

/**
 * Created by 25858 on 2017/3/19.
 */

public abstract class BaseRelativeLayout extends RelativeLayout {

    public BaseRelativeLayout(Context context) {
        this(context, null);
    }

    public BaseRelativeLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        bindView();
    }

    private void bindView() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(getLayout(), this, true);
        ButterKnife.bind(this);
    };

    //重写这个方法就能加载布局了。
    abstract protected int getLayout();

}
