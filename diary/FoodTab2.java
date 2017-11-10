package com.jw.diary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

/**
 * Created by Jessie on 30/10/2017.
 */

public class FoodTab2 extends Fragment {

    private Switch mSwitch1, mSwitch2, mSwitch3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_food_tab_2, container,false);

        mSwitch1 = (Switch) rootView.findViewById(R.id.switchLeafy);
        mSwitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String text = isChecked ? "Yes" : "No";
                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();            }
        });
        //return view;

        mSwitch2 = (Switch) rootView.findViewById(R.id.switchRed);
        mSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String text = isChecked ? "Yes" : "No";
                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();            }
        });

        mSwitch3 = (Switch) rootView.findViewById(R.id.switchPurple);
        mSwitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String text = isChecked ? "Yes" : "No";
                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();            }
        });
        return rootView;
        //inflater.inflate(R.layout.fragment_diet_tab1, container, false);
    }
}
