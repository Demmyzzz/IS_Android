package com.example.demmy.svet;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("ResourceAsColor")
    public void onGreen(View view) {

        LinearLayout ll = (LinearLayout)findViewById(R.id.main);
        ll.setBackgroundResource(R.color.colorGreen);

    }

    public void onYellow(View view) {

        LinearLayout ll = (LinearLayout)findViewById(R.id.main);
        ll.setBackgroundResource(R.color.colorYellow);

    }

    public void onRed(View view) {

        LinearLayout ll = (LinearLayout)findViewById(R.id.main);
        ll.setBackgroundResource(R.color.colorRed);

    }

    public void ref(View view) {

        LinearLayout ll = (LinearLayout)findViewById(R.id.main);
        ll.setBackgroundColor(000000);

    }
}
