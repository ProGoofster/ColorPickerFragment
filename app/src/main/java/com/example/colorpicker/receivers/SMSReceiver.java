package com.example.colorpicker.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class SMSReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // What we want to do when the SMS happens
        final Bundle bundle = intent.getExtras();
        //copy from someone else

        // an Intent broadcast.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
