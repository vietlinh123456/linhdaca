package com.example.lab1_nc;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Myservice1 extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Bundle bundle=intent.getBundleExtra("std");
        int id=bundle.getInt("id");
        String name=bundle.getString("name");
        String cls=bundle.getString("lop");
      Toast.makeText(this,"them sinh vien thanh cong:"+ "id:"+id +"ten sv:"+name +"lop :"+cls,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"ham tat dk goi",Toast.LENGTH_LONG).show();
    }
}
