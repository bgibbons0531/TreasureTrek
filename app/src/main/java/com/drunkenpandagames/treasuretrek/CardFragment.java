package com.drunkenpandagames.treasuretrek;

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;

import static com.drunkenpandagames.treasuretrek.R.layout.card_fragment;

/*
 * Created by Jackson Schilmoeller on February 18th, 2017
 */
public class CardFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(card_fragment, container, false);
    }
}
