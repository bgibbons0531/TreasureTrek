package com.drunkenpandagames.treasuretrek;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class GameMenuActivity extends AppCompatActivity {

    private float x1,x2;
    static final int MIN_DISTANCE = 150;

    public Player player;
    public CardFragment currentCard;
    public Deck deck;
    public Card currCard;
    public int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        player = new Player();
        index = 0;
        currentCard = new CardFragment();
        deck = new Deck();
        currCard = deck.getCardByIndex(index);
        setContentView(R.layout.activity_game_menu);
        showVitals();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, currentCard);
        fragmentTransaction.commit();
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
                if (Math.abs(change) > MIN_DISTANCE) {
                    if (x2 > x1) {
                        //Swipe right
                        index++;
                        currCard.swipeRight(deck, player);
                        if (player.isAlive() && index < 30) { // Keep playing
                            newCard = deck.getCardByIndex(index);
                            currCard = newCard;
                            nextCard = new CardFragment();
                            fragmentTransaction.setCustomAnimations(0, R.animator.slide_out_right, 0, R.animator.slide_out_right);
                            fragmentTransaction.remove(currentCard);
                            fragmentTransaction.add(R.id.fragment_container, nextCard);
                            fragmentTransaction.commit();
                            showVitals();
                        } else if (player.isAlive()) { // Game won
                            Intent intent = new Intent(this, VictoryActivity.class);

                            startActivity(intent);
                        } else { // Game loss
                            Intent intent = new Intent(this, DefeatActivity.class);

                            startActivity(intent);
                        }
                    } else {
                        //Swipe Left
                        index++;
                        currCard.swipeLeft(deck, player);
                        if (player.isAlive() && index < 30) { // Keep playing
                            newCard = deck.getCardByIndex(index);
                            currCard = newCard;
                            nextCard = new CardFragment();
                            fragmentTransaction.setCustomAnimations(0, R.animator.slide_out_left, 0, R.animator.slide_out_left);
                            fragmentTransaction.replace(R.id.fragment_container, nextCard);
                            fragmentTransaction.commit();
                            showVitals();
                        } else if (player.isAlive()) { // Game won
                            Intent intent = new Intent(this, VictoryActivity.class);

                            startActivity(intent);
                        } else { // Game loss
                            Intent intent = new Intent(this, DefeatActivity.class);

                            startActivity(intent);
                        }
                    }
                }
                break;
        }
        return true;
    }

    private void showVitals() {
        TextView h_v = (TextView)findViewById(R.id.health_view);
        TextView e_v = (TextView)findViewById(R.id.energy_view);
        TextView s_v = (TextView)findViewById(R.id.sanity_view);

        String h = "H: " + player.getHealth();
        String e = "E: " + player.getEnergy();
        String s = "S: " + player.getSanity();

        h_v.setText(h);
        e_v.setText(e);
        s_v.setText(s);
    }
}
