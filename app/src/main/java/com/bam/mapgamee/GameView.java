package com.bam.mapgamee;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class GameView extends View {
    private float posX,posY;

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("Game","onDraw" +getWidth() +","+getHeight());
        Paint paint = new Paint();
        canvas.drawLine(400,0,0,600,paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.sheep);
        canvas.drawBitmap(bitmap,0,400,paint);
    }

    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        if(posX > 0 && posX < getWidth()-50){
            this.posX = posX;
        }
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        if(posY > 0 && posY < getHeight()-200){
            this.posY = posY;
        }
    }
}
