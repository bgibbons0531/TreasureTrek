package com.drunkenpandagames.treasuretrek;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class HelpMenuActivity extends AppCompatActivity {

    private float x1,x2;
    static final int MIN_DISTANCE = 150;
    int viewFlag = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial_screen_1);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        CardFragment nextCard;
        Card newCard;
        int action = MotionEventCompat.getActionMasked(event);
        switch (action) {
            case (MotionEvent.ACTION_DOWN):
                x1 = event.getX();
                break;
            case (MotionEvent.ACTION_UP):
                x2 = event.getX();
                float change = x2 - x1;
                if (!((Math.abs(change) > MIN_DISTANCE))) {
                    switch (viewFlag) {
                        case (1):
                            setContentView(R.layout.tutorial_screen_2);
                            viewFlag++;
                            break;
                        case (2):
                            setContentView(R.layout.tutorial_screen_3);
                            viewFlag++;
                            break;
                        case (3):
                            setContentView(R.layout.tutorial_screen_4);
                            viewFlag++;
                            break;
                        case (4):
                            setContentView(R.layout.tutorial_screen_5);
                            viewFlag++;
                            break;
                        case (5):
                            setContentView(R.layout.tutorial_screen_6);
                            viewFlag++;
                            break;
                        case (6):
                            viewFlag = 0;
                            Intent intent = new Intent(this, MainMenuActivity.class);
                            startActivity(intent);
                            break;
                    }
                }
                break;
        }
        return true;
    }
}
