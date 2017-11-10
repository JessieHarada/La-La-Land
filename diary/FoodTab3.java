package com.jw.diary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.Toast;

/**
 * Created by Jessie on 30/10/2017.
 */

public class FoodTab3 extends Fragment {

    private RatingBar mRatingBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_food_tab_3, container,false);
        mRatingBar = (RatingBar) rootView.findViewById(R.id.ratingBar);
        mRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                String text;
                switch ((int) Math.floor(rating)){
                    case 0: text = "Zero"; break;
                    case 1: text = "One"; break;
                    case 2: text = "Two"; break;
                    case 3: text = "Three"; break;
                    case 4: text = "Four"; break;
                    case 5: text = "Five"; break;
                    default: text = "";
                }

                if (rating % 1 != 0){
                    text += " with half";
                }

                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
        //inflater.inflate(R.layout.fragment_diet_tab1, container, false);
    }
}
