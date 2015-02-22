package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by ABHISHEK MAURYA on 24-01-2015.
 */
public class ComperingAbout extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comperingabout);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
