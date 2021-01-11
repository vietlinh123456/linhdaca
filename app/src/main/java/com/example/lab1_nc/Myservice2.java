package com.example.lab1_nc;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Myservice2 extends Service {
    int linh = 0;
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        Bundle bundle = intent.getBundleExtra("tim");
        String srt = bundle.getString("edt");
        char[] chars = srt.toCharArray();//bien chuoi thanh mang ki tu
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'A') {
                linh++;
            }
            Toast.makeText(this, "so luong ki tu A la:" + linh, Toast.LENGTH_SHORT).show();
        }
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
