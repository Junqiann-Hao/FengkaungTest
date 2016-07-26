package com.example.listview;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by 郝俊谦 on 2016/7/26.
 * 测试github同步
 */
public class TestActivity extends Activity {
    private static final String TAG = "TestActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "onCreate: 第一次测试内容");
        Log.d(TAG, "第一次测试内容");

    }

    public void sayHello()
    {
        System.out.print("第二次增加的内容");
    }
}
