package com.example.jnitest2;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    Context mContext;

    static{
        System.loadLibrary("jniCalculator");
    }

    public native String getSum(String text);

    WebAppInterface(Context c) {
        mContext = c;
    }

    @JavascriptInterface
    public void justDoIt(String keyword) {
        String txt = getSum(keyword);
        Toast.makeText(mContext, "keyword is" + keyword, Toast.LENGTH_LONG).show();

    }
}
