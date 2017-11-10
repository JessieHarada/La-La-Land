package com.jw.diary;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    //public static final String EXTRA_MESSAGE = "com.jw.diary.MESSAGE";

    private Button b1, b2;
    private EditText ed1, ed2;

    private TextView tx1;
    private int counter = 3;
    //https://www.tutorialspoint.com/android/android_shared_preferences.htm
    //https://www.youtube.com/watch?v=-JQKKAVBgVw
    //private EditText etUsername, etPass;
    private CheckBox rem_userpass;

    SharedPreferences sharedPreferences;

    private static final String PREF_NAME = "prefs";
    private static final String KEY_REMEMBER = "remember";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASS = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        //etUsername = (EditText)findViewById(R.id.editText);
        //etPass = (EditText)findViewById(R.id.editText2);
        rem_userpass = (CheckBox) findViewById(R.id.remember);

        b1 = (Button) findViewById(R.id.button);
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);

        extractPreferences();
        b2 = (Button) findViewById(R.id.button2);
        tx1 = (TextView) findViewById(R.id.textView2);
        tx1.setVisibility(View.VISIBLE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ed1.setText(sharedPreferences.getString(KEY_USERNAME,""));
                // ed2.setText(sharedPreferences.getString(KEY_PASS,""));
                if (ed1.getText().toString().equals("jessie") &&
                        ed2.getText().toString().equals("100")) {
                    goToNextScreen();
                } else {
                    Toast.makeText(getApplicationContext(), "Opps - Wrong Credentials", Toast.LENGTH_SHORT).show();

                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.BLUE);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        b1.setEnabled(false);
                    }
                }

            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(getApplicationContext(),
                        "Leaving La La Land", Toast.LENGTH_SHORT).show();
            }
        });

        Log.i("LoginActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("LoginActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LoginActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LoginActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LoginActivity", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LoginActivity", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LoginActivity", "onDestroy");
    }


    private void extractPreferences() {
        if (sharedPreferences.getBoolean(KEY_REMEMBER, false)) {
            rem_userpass.setChecked(true);
            ed1.setText(sharedPreferences.getString(KEY_USERNAME, ""));
            ed2.setText(sharedPreferences.getString(KEY_PASS, ""));
        } else
            rem_userpass.setChecked(false);
    }

    private void goToNextScreen() {
        Toast.makeText(getApplicationContext(),
                "Welcome...", Toast.LENGTH_SHORT).show();
        /*come into the new page*/
        /*https://stackoverflow.com/questions/24610527/how-do-i-get-a-button-to-open-another-activity-in-android-studio*/
        managePrefs();
        startActivity(new Intent(MainActivity.this, MenuActivity.class));
    }

    //https://developer.android.com/guide/topics/data/data-storage.html#pref
    //rem_userpass.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) rem_userpass);
    // ed1.addTextChangedListener(this);
    //ed2.addTextChangedListener(this);

    private void managePrefs() { //EditText ed1, EditText ed2
        if (rem_userpass.isChecked()) {
            sharedPreferences
                    .edit()
                    .putString(KEY_USERNAME, ed1.getText().toString().trim())
                    .putString(KEY_PASS, ed2.getText().toString().trim())
                    .putBoolean(KEY_REMEMBER, true)
                    .apply();
        } else {
            sharedPreferences.edit()
                    .putBoolean(KEY_REMEMBER, false)
                    .remove(KEY_PASS)
                    .remove(KEY_USERNAME)
                    .apply();
        }
    }
    /** Called when the user taps the Send button */
    // public void Menu (View view) {
    //the method inside starts the activity
    //create an intent: intent is like an envelop,
    //  Intent intent = new Intent (this, MenuActivity.class);
    //  EditText editText = (EditText) findViewById(R.id.editText);
    //  String message = editText.getText().toString();
    //  intent.putExtra(EXTRA_MESSAGE, message);
    // startActivity(intent);
    //}

}