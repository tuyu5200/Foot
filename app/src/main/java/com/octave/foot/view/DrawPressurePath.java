package com.octave.foot.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Paosin Von Scarlet on 2017/1/9.
 */

public class DrawPressurePath extends View {

    private float mX;
    private float mY;

    private final Paint mGesturePaint = new Paint();
    private final Path mPath = new Path();

    public DrawPressurePath(Context context) {
        super(context);
        mGesturePaint.setAntiAlias(true);
        mGesturePaint.setStyle(Paint.Style.STROKE);
        mGesturePaint.setStrokeWidth(5);
        mGesturePaint.setColor(Color.WHITE);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
        
    }

    public DrawPressurePath(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPressurePath(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DrawPressurePath(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
