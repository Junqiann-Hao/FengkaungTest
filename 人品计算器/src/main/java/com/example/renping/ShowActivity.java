package com.example.renping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;

public class ShowActivity extends AppCompatActivity {
    private static final String TAG = "ShowActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent intent = getIntent();
        TextView tv_name = (TextView) findViewById(R.id.tv_name);
        TextView tv_sex = (TextView) findViewById(R.id.tv_sex);
        TextView tv_txt = (TextView) findViewById(R.id.tv_txt);

        String name = intent.getStringExtra("name");
        int sex = intent.getIntExtra("sex", 0);
        Log.i(TAG, "onCreate: sex="+sex);
        tv_name.setText(name);

        byte[] bytes = null;

        try {
            switch (sex) {
                case 1:
                    Log.i(TAG, "onCreate: 选择男的执行");
                    tv_sex.setText("男");
                    bytes = name.getBytes("gbk");
                    break;
                case 2:
                    Log.i(TAG, "onCreate: 选择女的执行");
                    tv_sex.setText("女");
                    bytes = name.getBytes("utf-8");
                    break;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        int total = 0;

        for (byte b : bytes) {
            int number = b & 0xff;
            total += number;
        }

        int code = Math.abs(total) % 100;

        if (code > 90) {
            tv_txt.setText("您的人品非常好 您家的祖坟都冒青烟了");
        } else if (code > 70) {
            tv_txt.setText("有你这样的人品算是不错了");
        }else if (code > 60) {
            tv_txt.setText("您的人品刚刚及格");
        }else {
            tv_txt.setText("您的人品不及格....");
        }

    }
}
