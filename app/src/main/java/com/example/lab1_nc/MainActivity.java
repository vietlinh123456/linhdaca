package com.example.lab1_nc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button bntstart,btnstop,btnTim;
EditText editText;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bntstart=findViewById(R.id.btn_start);
        btnstop=findViewById(R.id.btn_stop);
        editText=findViewById(R.id.editTextTextPersonName);

       intent=new Intent(this,Mysevicer.class);

        intent=new Intent(this,Myservice1.class);
        Bundle bundle=new Bundle();
        bundle.putInt("id",1);
        bundle.putString("name","dinh viet linh");
        bundle.putString("lop","mob15161");
        intent.putExtra("std",bundle);
    }
    public void start(View view){
        startService(intent);
    }
    public void stop(View view){
        stopService(intent);
    }

    public void tim(View view) {
        Bundle bundle=new Bundle();
        bundle.putString("edt",editText.getText().toString());
        intent=new Intent(this,Myservice2.class);
        intent.putExtra("tim",bundle);
        startService(intent);
    }
}