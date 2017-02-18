package com.drunkenpandagames.treasuretrek;

import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class GameMenuActivity extends AppCompatActivity {

    private float x1,x2;
    static final int MIN_DISTANCE = 150;

    CardFragment currentCard = new CardFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_menu);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){

        int action = MotionEventCompat.getActionMasked(event);
        switch (action) {
            case (MotionEvent.ACTION_DOWN):
                x1 = event.getX();
                break;
            case (MotionEvent.ACTION_UP):
                x2 = event.getX();
                float change = x2 - x1;
                if (Math.abs(change) > MIN_DISTANCE) {
                    if (x2 > x1) {
                        //Right Swipe
                    } else {
                        //Left Swipe
                    }
                } else {
                    //Tap
                }
                break;
        }
        return true;
    }
}
