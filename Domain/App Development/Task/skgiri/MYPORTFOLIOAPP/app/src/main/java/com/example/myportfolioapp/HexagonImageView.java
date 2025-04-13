package com.example.myportfolioapp;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Region;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class HexagonImageView extends AppCompatImageView {

    private Path hexagonPath;
    private Paint borderPaint;

    public HexagonImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        hexagonPath = new Path();

        borderPaint = new Paint();
        borderPaint.setColor(0xFF2145B0); // Hex border color
        borderPaint.setStrokeWidth(8f);
        borderPaint.setStyle(Paint.Style.STROKE);
        borderPaint.setAntiAlias(true);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        float radius = w / 2f;
        float triangleHeight = (float) (Math.sqrt(3) * radius / 2);
        float centerX = w / 2f;
        float centerY = h / 2f;

        hexagonPath.reset();
        hexagonPath.moveTo(centerX, centerY - radius);
        hexagonPath.lineTo(centerX + triangleHeight, centerY - radius / 2);
        hexagonPath.lineTo(centerX + triangleHeight, centerY + radius / 2);
        hexagonPath.lineTo(centerX, centerY + radius);
        hexagonPath.lineTo(centerX - triangleHeight, centerY + radius / 2);
        hexagonPath.lineTo(centerX - triangleHeight, centerY - radius / 2);
        hexagonPath.close();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.clipPath(hexagonPath, Region.Op.INTERSECT);
        super.onDraw(canvas);
        canvas.drawPath(hexagonPath, borderPaint);
    }
}
