package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by ABHISHEK MAURYA on 21-01-2015.
 */
public class Results extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("https://docs.google.com/document/d/1qq26PzdZ0yLRfeDcj3hyqdgI8r-l7RpKaz6kDGs6Pas/pub");
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
