package com.drunkenpandagames.treasuretrek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class VictoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory);
    }

    /** Called when the user clicks the Send button */
    public void toMainMenu() {
        Intent intent = new Intent(this, MainMenuActivity.class);

        startActivity(intent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){

        toMainMenu();

        return true;
    }
}
