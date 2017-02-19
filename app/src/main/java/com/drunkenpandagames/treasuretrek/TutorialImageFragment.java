package com.drunkenpandagames.treasuretrek;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.drunkenpandagames.treasuretrek.R.layout.image_fragment;


/*
 * Created by Jackson Schilmoeller on February 19th, 2017
 */

public class TutorialImageFragment {

    public TutorialImageFragment(){
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(image_fragment, container, false);
    }
}
