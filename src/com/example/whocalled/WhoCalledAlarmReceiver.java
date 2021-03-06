package com.example.whocalled;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class WhoCalledAlarmReceiver extends BroadcastReceiver {

	private static final String LOGGING_TAG = "AlarmReceiver";
	
	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d(LOGGING_TAG,"onReceive");
		Intent service = new Intent(context, WhoCalledService.class);
		context.startService(service);
	}
}
