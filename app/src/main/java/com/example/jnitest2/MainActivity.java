package com.example.jnitest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //public TextView txt_result;
    static{
        System.loadLibrary("jniCalculator");
    }

    public native String getSum(String text);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.addJavascriptInterface(new WebAppInterface(this), "Hyunsoo");

        myWebView.loadUrl("file:///android_asset/sample.html");
        //txt_result = (TextView) findViewById(R.id.txt_result);

        //String txt = getSum("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        //txt_result.setText(txt);
    }
}

