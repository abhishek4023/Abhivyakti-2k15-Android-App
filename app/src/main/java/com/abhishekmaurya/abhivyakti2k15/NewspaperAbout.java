package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by ABHISHEK MAURYA on 28-01-2015.
 */
public class NewspaperAbout extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newspaperabout);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
