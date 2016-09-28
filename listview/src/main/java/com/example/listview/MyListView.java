package com.example.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/**
 * Created by 16359 on 2016/9/22.
 * 带下拉刷新的listview
 */

public class MyListView extends ListView {

    /**
     * 头布局
     */
    private View mHeadView;

    public MyListView(Context context) {
        super(context);
        init();
    }


    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    /**
     * 初始化头布局,脚布局
     * 滚动监听
     */
    private void init() {
        initHeadView();
    }

    /**
     * 初始化头布局
     */
    private void initHeadView() {
        mHeadView = View.inflate(getContext(), R.layout.layout_header_list, null);
        addHeaderView(mHeadView);
    }
}
