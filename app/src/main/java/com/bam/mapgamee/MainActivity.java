package com.bam.mapgamee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private GameView gameView; //是GameView不是View 不要再錯了

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
    }

    private void findView() {
        findViewById(R.id.arrow_down).setOnClickListener(this);
        findViewById(R.id.arrow_left).setOnClickListener(this);
        findViewById(R.id.arrow_right).setOnClickListener(this);
        findViewById(R.id.arrow_up).setOnClickListener(this);
        gameView = findViewById(R.id.game);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.arrow_up:
                Log.d("MainActivity","onClick_up");
                gameView.setPosY(gameView.getPosY()-50);
                gameView.invalidate();
                break;
            case R.id.arrow_down:
                Log.d("MainActivity","onClick_down");
                gameView.setPosY(gameView.getPosY()+50);
                gameView.invalidate();
                break;
            case R.id.arrow_left:
                Log.d("MainActivity","onClick_left");
                gameView.setPosX(gameView.getPosX()-50);
                gameView.invalidate();
                break;
            case R.id.arrow_right:
                Log.d("MainActivity","onClick_right");
                gameView.setPosX(gameView.getPosX()+50);
                gameView.invalidate();
                break;
        }
    }
}