package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by ABHISHEK MAURYA on 26-01-2015.
 */
public class Day2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("https://docs.google.com/document/d/127pvoEsyLHZVgEKkAkbKJEWtxtTTlzRtNiI7ywA0_1k/pub");

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
