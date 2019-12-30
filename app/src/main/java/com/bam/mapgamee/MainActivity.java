package com.bam.mapgamee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
    }

    private void findView() {
        findViewById(R.id.arrow_down).setOnClickListener(this);
        findViewById(R.id.arrow_up).setOnClickListener(this);
        findViewById(R.id.arrow_left).setOnClickListener(this);
        findViewById(R.id.arrow_right).setOnClickListener(this);
        gameView = findViewById(R.id.game);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.arrow_up:
                Log.d("MainActivity","onClick_up");
                break;
            case R.id.arrow_down:
                Log.d("MainActivity","onClick_down");
                break;
            case R.id.arrow_left:
                Log.d("MainActivity","onClick_left");
                break;
            case R.id.arrow_right:
                Log.d("MainActivity","onClick_right");
                break;
        }
    }
}
