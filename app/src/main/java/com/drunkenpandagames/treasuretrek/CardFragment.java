package com.drunkenpandagames.treasuretrek;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.provider.ContactsContract;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static com.drunkenpandagames.treasuretrek.R.layout.card_fragment;

/*
 * Created by Jackson Schilmoeller on February 18th, 2017
 */
public class CardFragment extends Fragment {

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
        titleText.setText(Html.fromHtml(title));
        option1Text.setText(Html.fromHtml(option1String));
        option2Text.setText(Html.fromHtml(option2String));

        ImageView imageView = (ImageView)v.findViewById(R.id.card_image);
        Context context = imageView.getContext();
        int id = context.getResources().getIdentifier(((GameMenuActivity)getActivity()).currCard.getPath(), "mipmap", context.getPackageName());
        imageView.setImageResource(id);
        return v;
    }
}
