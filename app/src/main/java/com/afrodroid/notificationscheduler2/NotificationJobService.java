package com.afrodroid.notificationscheduler2;

import android.app.NotificationManager;
import android.app.job.JobParameters; 
import android.app.job.JobService;
import android.os.Build;

public class NotificationJobService extends JobService {
    NotificationManager mNotificationManager;
    //Notification Channel ID
    public static final String PRIMARY_CHANNEL_ID = "primary_notification_channel";




    @Override
    public boolean onStartJob(JobParameters params) {

        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }


    public void createNotificationChannel() {
        //Define notification manager object.
        mNotifyManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        //Notification channels are only available in Oreo and higher.
        //So, add a check on SDK version.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            //Make a notification channel
        }
    }
}
