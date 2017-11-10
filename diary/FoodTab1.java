package com.jw.diary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Jessie on 30/10/2017.
 */

public class FoodTab1 extends Fragment {
    // private Spinner mSpinner1, mSpinner2, mSpinner3;
    public static final String[] YES_NO = new String[]{
            "Yes", "No"
    };
    private Spinner mFruitSpinner, mMeatSpinner, mEggSpinner;
    private AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener(){

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(getContext(), YES_NO[position], Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_food_tab_1, container, false);
        mFruitSpinner = (Spinner) rootView.findViewById(R.id.spinnerfruits);
        mMeatSpinner = (Spinner) rootView.findViewById(R.id.spinnermeat);
        mEggSpinner = (Spinner) rootView.findViewById(R.id.spinneregg);

        mFruitSpinner.setOnItemSelectedListener(onItemSelectedListener);
        mMeatSpinner.setOnItemSelectedListener(onItemSelectedListener);
        mEggSpinner.setOnItemSelectedListener(onItemSelectedListener);

        mFruitSpinner.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_dropdown_item, YES_NO));
        mMeatSpinner.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_dropdown_item, YES_NO));
        mEggSpinner.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_dropdown_item, YES_NO));


        return rootView;
        //inflater.inflate(R.layout.fragment_diet_tab1, container, false);
    }

}
