package com.example.thread;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView)findViewById(R.id.msg);
        txt.setText("Got Message");
        Handler delaytime = new Handler();
        delaytime.postDelayed(delay, 4000);
    }
    private final Runnable delay = new Runnable() {
        @Override
        public void run() {
            txt.setText("Got it");
        }
    };
}