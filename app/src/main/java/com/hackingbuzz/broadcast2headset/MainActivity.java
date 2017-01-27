package com.hackingbuzz.broadcast2headset;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

// this broadcast is just to show user info regading your app...

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

                                                            // see in "custom Broacast" we create .....our intent action matches our own intent filter to perform the task... if they are equal (custom inplicit intent)
                                                                // if its system defined implict intent  then... it will automatically call the intent when we install the aplication in phone (what our intent is gonna do is what we define in our intenr filter (action, category, data)
                                                                  // and the action we want to know is power connected ?..
    public void broadcastIntent(View view){
        Intent intent = new Intent();

                                                                           // once its matchted with our own intent filter ..it gonna called  MyReceiver (Broadcast java file)
        intent.setAction("Dance");                                                 // this action will intent do ..what we want intent to do
       sendBroadcast(intent);                                                   // pre defined method to send intent to system for compare
    }
}

// there a differnce how intent filter actually work ..for just implicit intents

// n how intent and intent filters actually work with broadcast reciver/