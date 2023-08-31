package com.example.jnitest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView txt_result;
    static{
        System.loadLibrary("jniCalculator");
    }

    public native String getSum(String text);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_result = (TextView) findViewById(R.id.txt_result);


        String txt = getSum("AAAAAAAAAA");
        txt_result.setText(txt);
    }
}