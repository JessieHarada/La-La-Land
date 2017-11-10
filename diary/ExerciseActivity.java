package com.jw.diary;

//http://www.truiton.com/2017/01/android-bottom-navigation-bar-example/
//https://www.youtube.com/watch?v=wcE7IIHKfRg
//https://segunfamisa.com/posts/bottom-navigation-view-android

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

public class ExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.sunny_day);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.action_item1:
                                selectedFragment = Fragment_sunny.newInstance();
                                break;
                            case R.id.action_item2:
                                selectedFragment = Fragment_rain.newInstance();
                                break;
                            case R.id.action_item3:
                                selectedFragment = Fragment_cloudy.newInstance();
                                break;
                        }
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });

        //Manually displaying the first fragment - one time only
         getSupportFragmentManager()
                 .beginTransaction()
                 .replace(R.id.frame_layout, Fragment_sunny.newInstance())
                 .commit();

        //Used to select an item programmatically
        //bottomNavigationView.getMenu().getItem(2).setChecked(true);

        Log.i("ExerciseActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("ExerciseActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ExerciseActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ExerciseActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ExerciseActivity", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ExerciseActivity", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ExerciseActivity", "onDestroy");
    }
}
