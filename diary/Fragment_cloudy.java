package com.jw.diary;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

//http://www.truiton.com/2017/01/android-bottom-navigation-bar-example/
//https://www.youtube.com/watch?v=Uv8L4UzAfk8
//https://www.youtube.com/watch?v=wcE7IIHKfRg
//https://developer.android.com/studio/projects/templates.html

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_cloudy extends Fragment {

    public ToggleButton toggleButton;
    public TextView stateOnOff;


    public static Fragment_cloudy newInstance() {
        Fragment_cloudy fragment = new Fragment_cloudy();
        return fragment;
    }

    private ToggleButton mButton1, mButton2, mButton3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment_cloudy, container, false);
        mButton1 = (ToggleButton) view.findViewById(R.id.cloudy_check_1);
        mButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String text = isChecked ? "I have done Yoga" : "I will do Yoga tomorrow";
                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();            }
        });
        //return view;

        mButton2 = (ToggleButton) view.findViewById(R.id.cloudy_check_2);
        mButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String text = isChecked ? "I have done gym" : "I will do gym tomorrow";
                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();            }
        });

        mButton3 = (ToggleButton) view.findViewById(R.id.cloudy_check_3);
        mButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String text = isChecked ? "I have done swimming" : "I will swim tomorrow";
                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();            }
        });
        return view;
    }

}
