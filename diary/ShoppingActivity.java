package com.jw.diary;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class ShoppingActivity extends AppCompatActivity {

    private Button mPlus, mMinus;
    private TextView mOutput;
    private EditText mNumber;

    private int currentNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    //http://hackpundit.com/android-tutorial-simple-calculator-app/
        mPlus = (Button) findViewById(R.id.shopping_plus);
        mMinus = (Button) findViewById(R.id.shopping_minus);
        mOutput = (TextView) findViewById(R.id.shopping_output);
        mNumber = (EditText) findViewById(R.id.shopping_numberField);

        mPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processNumber(true);
            }
        });
        mMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processNumber(false);
            }
        });
        Log.i("ShoppingActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ShoppingActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ShoppingActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ShoppingActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ShoppingActivity", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ShoppingActivity", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ShoppingActivity", "onDestroy");
    }

    //https://www.androidauthority.com/build-a-calculator-app-721910/

    @SuppressLint("SetTextI18n")
    private void processNumber(boolean plus){
        if (mNumber.getText().length() == 0) return;
        int number = Integer.parseInt(mNumber.getText().toString());

        int newNumber = plus ? currentNumber + number : currentNumber - number;

        // %d %s
        String text = String.format(Locale.getDefault(), "\n%d %s %d = %d", currentNumber,
                plus ? "+" : "-", number, newNumber);
        mOutput.setText(mOutput.getText().toString() + text);

        currentNumber = newNumber;
        mNumber.setText("");
    }
}
