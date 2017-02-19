package com.drunkenpandagames.treasuretrek;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Path;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
