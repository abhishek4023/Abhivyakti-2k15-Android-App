package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by ABHISHEK MAURYA on 26-01-2015.
 */
public class Day1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("https://docs.google.com/document/d/1iVk3JGEaydKkVhDSRlUlr_xKTE4A8-ZjdVbqZ4R3Wdo/pub");

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
