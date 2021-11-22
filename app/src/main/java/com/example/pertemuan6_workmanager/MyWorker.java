package com.example.pertemuan6_workmanager;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWorker  extends Worker {
    public MyWorker(Context context, WorkerParameters workerParams){
        super(context, workerParams);
    }

    public Result doWork(){
        displayNotification("Ini adalah Task Kamu", "Task kamu sudah selesai");
        return  Result.success();
    }

    public void displayNotification(String task, String desc){
        NotificationManager manager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationChannel channel = new NotificationChannel("terserah", "test123", NotificationManager.IMPORTANCE_HIGH);
        manager.createNotificationChannel(channel);
    }
}
