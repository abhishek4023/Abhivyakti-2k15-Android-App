package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by ABHISHEK MAURYA on 28-01-2015.
 */
public class XeroAbout extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xeroabout);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
