package com.jw.diary.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jw.diary.R;

/**
 * Created by Jessie on 31/10/2017.
 */

public class TextFragment extends Fragment {

    public void setText(String text) {
        this.text = text;
    }

    private String text;

    public static TextFragment newInstance(String text){
        TextFragment fragment = new TextFragment();
        fragment.setText(text);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_text, container, false);
       TextView textView = (TextView) view.findViewById(R.id.fragment_text);
       textView.setText(text);
       return view;
    }
}
