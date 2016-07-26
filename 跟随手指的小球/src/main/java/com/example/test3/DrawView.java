package com.example.test3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by 16359 on 2016/7/5.
 */
public class DrawView extends View {
    public float x = 40;
    public float y = 50;

    //定义并创建画笔
    Paint paint = new Paint();

    public DrawView(Context context) {
        super(context);
    }

    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画笔颜色
        paint.setColor(Color.RED);
        //绘制一个圆
        canvas.drawCircle(x, y, 15, paint);
    }

    //为该组件的触碰事件重写事件处理方法

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        //修改x,y属性
        x = event.getX();
        y = event.getY();
        //通知当前组建重绘自己
        invalidate();
        return true;

    }

}
