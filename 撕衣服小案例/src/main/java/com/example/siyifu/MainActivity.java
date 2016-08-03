package com.example.siyifu;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView qian;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //[1]找到iv 显示我们操作的图片
        final ImageView iv = (ImageView) findViewById(R.id.iv);

        //[2]把我们要操作的图片转换成bitmap
        Bitmap srcBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.pre19);

        //[3]创建原图的副本

        //[3.1]创建模板
        final Bitmap alterbBitmap = Bitmap.createBitmap(srcBitmap.getWidth(), srcBitmap.getHeight(), srcBitmap.getConfig());
        //[3.2]以alterbBitmap bitmap为模板创建一个画布
        Canvas canvas = new Canvas(alterbBitmap);
        //[3.3]创建一个画笔
        Paint paint = new Paint();
        //[3.4]开始作画
        canvas.drawBitmap(srcBitmap, new Matrix(), paint);
        //[4]把alterbitmap显示到iv上
        iv.setImageBitmap(alterbBitmap);

        //[5]给iv设置一个触摸事件
        iv.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //[6]获取触摸事件的类型
                int action = event.getAction();
                switch (action) {

                    case MotionEvent.ACTION_MOVE: //移动

                        for (int i = -7; i < 30; i++) {  //改变x

                            for (int j = -7; j < 30; j++) {
                                //为了 良好的用户体验 撕一个圆
                                if (Math.sqrt(i * i + j * j) < 30) {
                                    //一次修改一个像素
                                    try {
                                        alterbBitmap.setPixel((int) event.getX() + i, (int) event.getY() + j, Color.TRANSPARENT);
                                    } catch (Exception e) {
                                    }
                                }


                            }

                        }


                        //一定要记得更新iv
                        iv.setImageBitmap(alterbBitmap);
                        break;

                }

                return true;
            }
        });

    }
    }
