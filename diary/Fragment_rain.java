package com.jw.diary;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_rain extends Fragment {


    public static Fragment_rain newInstance() {
        Fragment_rain fragment = new Fragment_rain();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    private RadioGroup mRadioGroup;

    //https://developer.android.com/reference/android/widget/RadioButton.html
    //https://developer.android.com/guide/topics/ui/controls/radiobutton.html

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_rain, container, false);
        mRadioGroup = (RadioGroup) view.findViewById(R.id.radioGroup);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String text = "";
                switch (checkedId) {
                    case R.id.rainy_check_1:
                        text = "You've done Yoga!";
                        break;
                    case R.id.rainy_check_2:
                        text = "Gym gym";

                        break;
                    case R.id.rainy_check_3:
                        text = "Woo swim!!";

                        break;
                }
                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
