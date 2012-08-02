package com.ford.openxc.backupcam;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Receive the BOOT_COMPLETED signal and start the VehicleMonitoringService.
**/

public class BootupReceiver extends BroadcastReceiver {
    private final static String TAG = "CameraBootupReceiver";

    @Override
    public void onReceive(final Context context, Intent intent) {
       
       	Intent MonitoringServiceIntent = new Intent(context, VehicleMonitoringService.class);
    	context.startService(MonitoringServiceIntent);	
     	Log.i(TAG, "Starting VehicleMonitoringService from BootupReceiver");
    }
}



	
