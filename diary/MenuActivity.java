package com.jw.diary;
//https://www.lynda.com/Android-tutorials/Start-activities-explicit-intents/442863/456789-4.html?autoplay=true
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

   // Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.happy);

       // b4 = (Button) findViewById(R.id.shopping);
       // b4.setOnClickListener(new View.OnClickListener() {
       //     @Override
         //   public void onClick(View v) {
        //        startActivity(new Intent(MenuActivity.this, ShoppingActivity.class));
         //   }
       // });

        Log.i("MenuActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("MenuActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MenuActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MenuActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MenuActivity", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MenuActivity", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MenuActivity", "onDestroy");
    }

    //https://developer.android.com/training/basics/firstapp/building-ui.html

    public void exercises (View view) { //(View view) context. call back method to get the button work
        //the method inside starts the activity
        //create an intent: intent is like an envelop,
        Intent intent = new Intent (this, ExerciseActivity.class);
        startActivity(intent);
    }

    public void food (View view) {
        Intent intent = new Intent (this, FoodActivity.class);
        startActivity(intent);
    }

    public void shopping (View view) {
        Intent intent = new Intent (this, ShoppingActivity.class);
        startActivity(intent);
    }

    public void alarm (View view) {
        Intent intent = new Intent (this, CalendarActivity.class);
        startActivity(intent);
    }

    public void diary (View view) {
        Intent intent = new Intent (this, DiaryActivity.class);
        startActivity(intent);
    }

    public void mom (View view) {
        Intent intent = new Intent (this, MomActivity.class);
        startActivity(intent);
    }
}
