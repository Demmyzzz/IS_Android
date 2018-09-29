package com.example.demmy.svet;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    int color = 0x111111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGreen(View view) {

        color = getResources().getColor(R.color.colorGreen);
        LinearLayout ll = (LinearLayout)findViewById(R.id.main);
        ll.setBackgroundColor(getResources().getColor(R.color.colorGreen));

    }

    public void onYellow(View view) {

        color = getResources().getColor(R.color.colorYellow);
        LinearLayout ll = (LinearLayout)findViewById(R.id.main);
        ll.setBackgroundResource(R.color.colorYellow);

    }

    public void onRed(View view) {

        color = getResources().getColor(R.color.colorRed);
        LinearLayout ll = (LinearLayout)findViewById(R.id.main);
        ll.setBackgroundResource(R.color.colorRed);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("bgcolor", color);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("bgcolor")) {
            color = savedInstanceState.getInt("bgcolor");
            findViewById(R.id.main).setBackgroundColor(color);
        }
    }


}
