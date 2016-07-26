package com.example.fengkaungtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
//纯java代码布局
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //创建线性布局管理器
        LinearLayout linearLayout = new LinearLayout(this);
        //设置Activity显示layout
        super.setContentView(linearLayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        //创建一个textview
        final TextView textView = new TextView(this);
        //创建按钮
        Button button = new Button(this);
        button.setText(R.string.ok);
        button.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        //向layout容器中添加textview
        linearLayout.addView(textView);
        //向layout中添加按钮
        linearLayout.addView(button);
        //为按钮绑定监听事件
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(getString(R.string.hello) + new Date());
            }
        });
    }
}
