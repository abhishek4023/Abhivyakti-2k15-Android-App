package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by ABHISHEK MAURYA on 05-02-2015.
 */
public class RitumMem extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ritummem);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
