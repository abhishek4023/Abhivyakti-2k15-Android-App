package com.abhishekmaurya.abhivyakti2k15;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by ABHISHEK MAURYA on 07-02-2015.
 */
public class RitumAbout extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ritumabout);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
