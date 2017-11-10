package com.jw.diary;
//https://stackoverflow.com/questions/12536125/findviewbyid-within-fragment
//https://www.youtube.com/watch?v=y0zrf1N_VIk
//https://stackoverflow.com/questions/27728439/implementing-onclicklistener-for-a-fragment-on-android

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_sunny extends Fragment {

    CheckBox checkbox1,checkbox2,checkbox3;
    TextView text;


    public static Fragment_sunny newInstance() {
        Fragment_sunny fragment = new Fragment_sunny();
        return fragment;
    }
    private CheckBox mCheck1, mCheck2, mCheck3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  checkbox1 = (CheckBox) getView().findViewById(R.id.sunny_check_1);
      //  checkbox2 = (CheckBox) getView().findViewById(R.id.sunny_check_2);
      //  checkbox3 = (CheckBox) getView().findViewById(R.id.sunny_check_3);

        //addListenerOnCh1();

    }
//    public void checksunny (View v) {
//
//       if (checkbox1.isChecked() && checkbox2.isChecked() && checkbox3.isChecked()) {
//            text.setText("I did all the exercises yay!");
//       } else if (checkbox1.isChecked()) {
//            text.setText("I did yoga");
//       } else if (checkbox2.isChecked()) {
//            text.setText("I did gym");
//        } else if (checkbox3.isChecked()) {
//            text.setText("I swimmed like fish");
//        } else {
//            text.setText("Lazy baby girl");
//        }
//    }

//    public void addListenerOnCh1() {
//
//        checkbox1 = (CheckBox) getView().findViewById(R.id.sunny_check_1);
//        checkbox1.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (((CheckBox) v).isChecked()) {
//                    text.setText("I did yoga");
//                }
//
//            }
//        });
//
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_sunny, container, false);
        //https://developer.android.com/guide/topics/ui/controls/checkbox.html
        mCheck1 = (CheckBox) view.findViewById(R.id.sunny_check_1);
        mCheck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String text = isChecked ? "Sunny Yoga" : "I will do Yoga tomorrow";
                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();            }
        });

        mCheck2 = (CheckBox) view.findViewById(R.id.sunny_check_2);
        mCheck2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String text = isChecked ? "Sunny Gym" : "I will do Yoga tomorrow";
                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();            }
        });


        mCheck3 = (CheckBox) view.findViewById(R.id.sunny_check_3);
        mCheck3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String text = isChecked ? "Sunny Swimming" : "I will do Yoga tomorrow";
                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();            }
        });
        return view;
    }
}
