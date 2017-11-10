package com.jw.diary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MomActivity extends AppCompatActivity {

    private EditText mEditText;
    private Button mSendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //https://stackoverflow.com/questions/21720640/sending-email-from-android-app-when-click-on-button
        //https://stackoverflow.com/questions/23385899/how-to-send-email-by-clicking-on-submit-button-in-android-application
        //https://www.tutorialspoint.com/android/android_sending_email.htm
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mom);
        mEditText = (EditText) findViewById(R.id.momletter);
        mSendButton = (Button) findViewById(R.id.sendemail);
        mSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mEditText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_SUBJECT, text);
                startActivity(Intent.createChooser(intent, ""));
            }
        });

        Log.i("MomActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MomActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MomActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MomActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MomActivity", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MomActivity", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MomActivity", "onDestroy");
    }
}
