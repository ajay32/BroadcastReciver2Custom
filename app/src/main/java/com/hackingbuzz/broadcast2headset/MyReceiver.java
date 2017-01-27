package com.hackingbuzz.broadcast2headset;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Avi Hacker on 1/26/2017.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Yo Yo I a Dancing..", Toast.LENGTH_LONG).show();
    }
}