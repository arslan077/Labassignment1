package com.example.labwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

class MainActivity extends AppCompatActivity {
private TextView oncreate, onstart,onresume ,onrestart;
private Button gotosecondpage;
private int c1,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oncreate=findViewById(R.id.OnCreateCalls);
        onstart=findViewById(R.id.OnStartCalls);
        onresume=findViewById(R.id.OnResumeCalls);
        onrestart=findViewById(R.id.OnRestartCalls);
        c1++;
        oncreate.setText(c1);
        gotosecondpage=findViewById(R.id.gotosecond);
        gotosecondpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondactivity=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(secondactivity);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        c2++;
    }

    @Override
    protected void onResume() {
        super.onResume();
        c3++;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        c4++;
    }
}