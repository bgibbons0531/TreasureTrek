package com.drunkenpandagames.treasuretrek;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class GameMenuActivity extends AppCompatActivity {

    private float x1,x2;
    static final int MIN_DISTANCE = 150;

    CardFragment currentCard;
    Deck deck;
    Card currCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        currentCard = new CardFragment();
        deck = new Deck();
        currCard = deck.getCardByIndex(0);
        setContentView(R.layout.activity_game_menu);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, currentCard);
        fragmentTransaction.commit();
        //currentCard.giveCard(currCard, currentView);
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
