package com.gentb.cacttusedu.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by gentberani on 11/20/17.
 */

@SuppressLint("AppCompatCustomView")
public class CustomImageView extends ImageView {

    private Paint paintBlue,
            paintRed;

    public CustomImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setupPaint();
    }

    private void setupPaint() {
        paintBlue = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintRed = new Paint(Paint.ANTI_ALIAS_FLAG);

        paintBlue.setColor(Color.BLUE);
        paintBlue.setStrokeWidth(20);

        paintRed.setColor(Color.RED);
        paintRed.setStrokeWidth(10);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawLine(0, 0, getMeasuredWidth(), getMeasuredHeight(), paintBlue);
        canvas.drawLine(0, getMeasuredHeight(), getMeasuredWidth(), 0, paintRed);

        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredWidth() / 2, getMeasuredWidth() / 4, paintBlue);
        canvas.drawRect(500, 500, 800, 700, paintRed);
        canvas.save();
        canvas.restore();
    }
}
