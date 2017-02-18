package com.drunkenpandagames.treasuretrek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameMenuActivity extends AppCompatActivity {

    CardFragment currentCard = new CardFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_menu);
    }
}
