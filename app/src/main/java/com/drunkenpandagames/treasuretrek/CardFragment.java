package com.drunkenpandagames.treasuretrek;

import android.app.Fragment;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.drunkenpandagames.treasuretrek.R.layout.card_fragment;

/*
 * Created by Jackson Schilmoeller on February 18th, 2017
 */
public class CardFragment extends Fragment {

    Card currentCard;
    String title;
    Option op1;
    Option op2;
    String option1String;
    String option2String;
    Resources res;
    TextView titleText;
    TextView option1Text;
    TextView option2Text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        res = getResources();
        title = ((GameMenuActivity)getActivity()).currCard.getTitle();
        op1 = ((GameMenuActivity)getActivity()).currCard.getOption1();
        op2 = ((GameMenuActivity)getActivity()).currCard.getOption2();
        option1String = op1.getMessage();
        option2String = op2.getMessage();
        View v = inflater.inflate(card_fragment, container, false);
        titleText = (TextView)v.findViewById(R.id.title_xml);
        option1Text = (TextView)v.findViewById(R.id.option1_xml);
        option2Text = (TextView)v.findViewById(R.id.option2_xml);
        titleText.setText(title);
        option1Text.setText(option1String);
        option2Text.setText(option2String);
        return v;
    }

    public void giveCard(Card p_currCard, View p_currView){
        currentCard = p_currCard;
        title = p_currCard.getTitle();
        op1 = p_currCard.getOption1();
        op2 = p_currCard.getOption2();
        //titleText = (TextView)p_currView.findViewById(R.id.title_xml);
        //TextView op1Text = (TextView)p_currView.findViewById(R.id.option1);
        //TextView op2Text = (TextView)p_currView.findViewById(R.id.option2);
        titleText.setText(title);
    }
}
